package com.lee.tree.springbootxtree.controller;

import com.alibaba.fastjson.JSON;
import com.lee.tree.springbootxtree.entity.TreeNode;;
import com.lee.tree.springbootxtree.mapper.TreeNodeMapper;
import com.lee.tree.springbootxtree.utils.TreeNodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tree")
@Slf4j
public class TreeNodeController {

    private Logger logger = LoggerFactory.getLogger(TreeNodeController.class);

    @Autowired
    private TreeNodeMapper treeNodeMapper;

    @RequestMapping(value = "/treenode/{parentId}")
    public String buildTreNode(@PathVariable(value = "parentId") Integer parentId){
        Long startTime = System.currentTimeMillis();
        logger.error("start: {}, request:{}, param: {}", "start", "/treenode/{parentId", parentId);
        List<TreeNode> treeNodeList = treeNodeMapper.selectAllTreeNode();
        TreeNodeUtil treeNodeUtil = new TreeNodeUtil(treeNodeList);
        List<TreeNode> treeNodes = treeNodeUtil.buildTree();
        String tree = JSON.toJSON(treeNodes).toString();
        logger.error("result: {}, time: {}", tree.toString(), System.currentTimeMillis() - startTime);
        return tree;
    }

}
