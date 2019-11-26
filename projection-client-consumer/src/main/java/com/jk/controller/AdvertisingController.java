package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.Advertising;
import com.jk.util.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("advertising")
@Controller
public class AdvertisingController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("queryAdvertising")
    @ResponseBody
    public JSONObject queryAdvertising(int page,int rows,Advertising adv){
        Query query = new Query();
        JSONObject json = new JSONObject();

        if(adv.getCompany() != null && !"".equals(adv.getCompany())){
            query.addCriteria(Criteria.where("company").regex(adv.getCompany()));
        }
        if (adv.getStatus()!=null&& !"".equals(adv.getStatus())) {
            query.addCriteria(Criteria.where("status").is(adv.getStatus()));
        }

        long zongshu = mongoTemplate.count(query, Advertising.class);
        query.skip((page-1)*rows);
        query.limit(rows);

        List<Advertising> list = mongoTemplate.find(query,Advertising.class);
        json.put("rows", list);
        json.put("total", zongshu);
        return json;
    }

    @RequestMapping("toAddAdvertising")
    public String toAddAdvertising(){
        return "addAdvertising";
    }

    /**
     * OSS阿里云上传图片
     * @return
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public Map uploadImg(MultipartFile imgfile)throws IOException {
        if (imgfile == null || imgfile.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgfile);
        String imgUrl = ossClient.getImgUrl(name);
        //String[] split = imgUrl.split("\\?");
        //System.out.println("图片url："+imgUrl);
        Map map = new HashMap();
        map.put("imgUrl",imgUrl);
        return map;
    }

    @RequestMapping("addAdvertising")
    @ResponseBody
    public void addAdvertising(Advertising adv){
        adv.setStatus(2);
        mongoTemplate.save(adv);
    }

    @RequestMapping("updAdvertising")
    @ResponseBody
    public Integer updAdvertising(Advertising adv){
        Query query = new Query();
        Criteria criteria = new Criteria();
        query.addCriteria(Criteria.where("id").is(adv.getId()));
        Update update = new Update();
        update.set("status",adv.getStatus());
        mongoTemplate.updateFirst(query,update,Advertising.class);
        return 1;
    }


}
