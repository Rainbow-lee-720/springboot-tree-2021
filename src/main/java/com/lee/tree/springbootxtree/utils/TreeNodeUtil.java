package com.lee.tree.springbootxtree.utils;

import com.lee.tree.springbootxtree.entity.TreeNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TreeNodeUtil {

    //节点集合
    private List<TreeNode> treeNodeList = new ArrayList<>();

    /**
     *  获取所有根结点
     */
    public List<TreeNode> getAllRootTreeNode() {
        List<TreeNode> rootTreeNodes = new ArrayList<>();
        //过滤出根节点
        for (TreeNode treeNode : treeNodeList) {
            if (treeNode.getPId() == 0) {
                //存放根节点返回
                rootTreeNodes.add(treeNode);
            }
        }
        return rootTreeNodes;
    }

    /**
     * 递归
     */
    public TreeNode buildChildTreeNode(TreeNode treeNode) {
        //存放子节点
        List<TreeNode> childTreeNodes = new ArrayList<>();
        //遍历需要构建树结构的节点集合
        for (TreeNode treeNodeLoop : treeNodeList) {
            //父子节点判断
            if (treeNodeLoop.getPId() == treeNode.getId()) {
                //说明还有子节点，递归处理
                childTreeNodes.add(buildChildTreeNode(treeNodeLoop));
            }
        }
        treeNode.setChildNodes(childTreeNodes);
        return treeNode;
    }

    /**
     * 构建树形结构
     */
    public List<TreeNode> buildTree() {
        //存放树节点
        List<TreeNode> treeNodeList = new ArrayList<>();
        //对根结点进行遍历
        for (TreeNode treeNode : getAllRootTreeNode()) {
            //对根节点进行构造子节点
             treeNode = buildChildTreeNode(treeNode);
             //存放构造后的根节点
            treeNodeList.add(treeNode);
        }
        return treeNodeList;
    }

}
