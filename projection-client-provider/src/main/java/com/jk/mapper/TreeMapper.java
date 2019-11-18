package com.jk.mapper;

import com.jk.model.Tree;

import java.util.List;

public interface TreeMapper {

    List<Tree> queryTreeNodes(int i);

    List<Tree> queryTreeList(int pid);
}
