package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Tree;

import com.jk.service.TreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {
    @Reference
    private TreeService treeService;

    @RequestMapping("queryTreeList")
    @ResponseBody
    public List<Tree> queryTreeList(){
        return treeService.queryTreeList();
    }

}
