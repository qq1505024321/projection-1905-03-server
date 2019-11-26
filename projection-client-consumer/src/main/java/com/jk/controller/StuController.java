package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Users;
import com.jk.service.StuService;
import com.jk.util.ExportExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("stu")
public class StuController {
    @Reference
    public StuService stuService;
    /*这是查询学生展示的方法*/
    @RequestMapping("queryUser")
    @ResponseBody
    public Map<String,Object> queryUser(Integer page, Integer rows, Users user){
        return stuService.queryUser(page,rows,user);
    }
    /*这是删除学生的方法*/
    @RequestMapping("deleteStuByIds")
    @ResponseBody
    public int deleteStuByIds(String ids){
        stuService.deleteStuByIds(ids);
        stuService.deleteStuByUserId(ids);
        return 1;
    }

    /*这是学生导出*/
    @RequestMapping("export")
    public void export(HttpServletResponse response, int page, int rows){
        List<Users> list= new ArrayList<Users>();

        try {
            Users users = new Users();
            Map<String, Object> stringObjectMap = stuService.queryUser(page, rows, users);
            list = (List<Users>) stringObjectMap.get("rows");
            //定义表格的标题
            String title ="奔奔在线教育平台用户展示";
            //定义列名
            String[] rowName={"编号","名称","手机","日期","学生数量"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            //循环数据把数据存放到 List<Object[]>
            for (Users user:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=user.getUserId();
                obj[1]=user.getUserName();
                obj[2]=user.getPhoneNumber();
                obj[3]=user.getCreateTime();
                obj[4]=user.getUserCount();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
