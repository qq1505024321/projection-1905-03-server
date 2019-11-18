package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TreeMapper;
import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;
   /* @Autowired
    private RedisTemplate<Object,Object> redisTemplate;*/

    @Override
    public List<Tree> queryTreeList() {

        /*List list=new ArrayList();
        String treecache = CommonConf.TREE_CACHE_KEY;
        if (redisTemplate.hasKey(treecache)) {
            redisTemplate.opsForValue().get(treecache);
            list=JSON.parseArray(string, Tree.class);
            System.out.println("==============缓存==============");
        }else{
            System.out.println("==============数据库==============");
            List<Tree> treeList = this.queryTreeNodes(-1);
            redisTemplate.opsForValue().set(treecache, JSON.toJSONString(treeList));
            redisTemplate.expire(treecache, 30, TimeUnit.MINUTES);
        }*/
        List<Tree> treeList = this.queryTreeNodes(0);
        return treeList;
    }

    private List<Tree> queryTreeNodes(int pid) {
        List<Tree> treeList = treeMapper.queryTreeList(pid);
        for (Tree tree : treeList) {
            List<Tree> nodes = queryTreeNodes(tree.getId());
            if(nodes != null && nodes.size() > 0) {
                tree.setNodes(nodes);
                tree.setLeaf(true);
                tree.setSelectable(false);
            } else {
                tree.setLeaf(false);
                tree.setSelectable(true);
            }
        }
        return treeList;
    }

}
