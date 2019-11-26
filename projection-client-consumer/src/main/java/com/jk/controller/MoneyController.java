package com.jk.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;

import com.jk.model.Orders;
import com.jk.service.MoneyService;

import com.jk.util.ExportExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/11/20
 * @since 1.0.0
 */
@Controller
@RequestMapping("money")
public class MoneyController {

    @Reference
    private MoneyService moneyService;

    @RequestMapping("toShowTeacherMoney")
    public String toShow(){
        return "Order/showTeacherMoney";
    }

    @RequestMapping("queryTeacherMoney")
    @ResponseBody
    public JSONObject queryTeacherMoney(Integer page, Integer rows, Orders orders){
          return moneyService.queryTeacherMoney(page,rows,orders);
    }

    @RequestMapping("toQueryMoney")
    public String toQueryMoney(){
        return "Order/showPlatformMoney";
    }

    @RequestMapping("queryPlatformMoney")
    @ResponseBody
    public JSONObject queryPlatformMoney(Integer page, Integer rows, Orders orders){
        return moneyService.queryPlatformMoney(page,rows,orders);
    }

    /*这是导出平台收入的方法 */
    @RequestMapping("exportPlat")
    public void export(HttpServletResponse response, int page, int rows){
        List<Orders> list= new ArrayList<Orders>();
        try {
            Orders orders = new Orders();
            Map<String, Object> stringObjectMap = moneyService.queryPlatformMoney(page, rows, orders);
            list = (List<Orders>) stringObjectMap.get("rows");
            //定义表格的标题
            String title ="奔奔在线教育平台收入展示";
            //定义列名
            String[] rowName={"编号","当月交易总金额","当月平台收入金额","月份"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            //循环数据把数据存放到 List<Object[]>
            for (Orders o:list) {
                Double aDouble = Double.valueOf(o.getMoney());
                Object[] obj=new Object[rowName.length];
                obj[0]=o.getId();
                obj[1]=o.getMoney();
                obj[2]=aDouble*0.1;
                obj[3]=o.getCurrentmonth();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*这是导出老师收入的方法 */
    @RequestMapping("exportTeacherMoney")
    public void exportTeacherMoney(HttpServletResponse response, int page, int rows){
        List<Orders> list= new ArrayList<Orders>();
        try {
            Orders orders = new Orders();
            Map<String, Object> stringObjectMap = moneyService.queryTeacherMoney(page, rows, orders);
            list = (List<Orders>) stringObjectMap.get("rows");
            //定义表格的标题
            String title ="奔奔在线教育老师收入展示";
            //定义列名
            String[] rowName={"编号","教师姓名","教师当月收入","月份"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();
            //循环数据把数据存放到 List<Object[]>
            for (Orders o:list) {
                Double aDouble = Double.valueOf(o.getMoney());
                Object[] obj=new Object[rowName.length];
                obj[0]=o.getId();
                obj[1]=o.getTeacher();
                obj[2]=aDouble*(1-0.1);
                obj[3]=o.getCurrentmonth();
                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("queryCakeMoney")
    @ResponseBody
    public List<Map<String,Object>> queryCakeMoney(){
        List<Map<String,Object>> map1 =moneyService.queryCakeMoney();
        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();
        for (Map<String,Object> map:map1) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("y",map.get("y"));
            if(map.get("老师姓名").toString().equals("cxf")){
                map3.put("name","cxf");
                map3.put("sliced",true);
                map3.put("selected",true);
            }else if(map.get("老师姓名").toString().equals("张三")){
                map3.put("name","张三");
            }else if(map.get("老师姓名").toString().equals("李四")){
                map3.put("name","李四");
            }else if(map.get("老师姓名").toString().equals("陈光")){
                map3.put("name","陈光");
            }else if(map.get("老师姓名").toString().equals("陈晓峰")){
                map3.put("name","陈晓峰");
            }else if(map.get("老师姓名").toString().equals("王五")){
                map3.put("name","王五");
            }else if(map.get("老师姓名").toString().equals("ycx")){
                map3.put("name","ycx");
            }else {
                map3.put("name","阿华1");
            }
            map2.add(map3);
        }
        return map2;

    }



}