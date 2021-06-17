package com.lee.tree.springbootxtree.mapper;

import com.lee.tree.springbootxtree.entity.TreeNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TreeNodeMapper {

    @Select(value = "SELECT id, name, p_id p_id, sort FROM t_tree ORDER BY sort")
    List<TreeNode> selectAllTreeNode();

    @Select(value = "SELECT id, name, p_id p_id, sort FROM t_tree WHERE p_id = 0  ORDER BY sort")
    List<TreeNode> selectAllRootTreeNode();

    @Select(value = "SELECT id, name, p_id pId, sort FROM t_tree WHERE p_id = #{parentId}  ORDER BY sort")
    List<TreeNode> selectSubTreeNodeByPId(@Param(value = "parentId") Integer parentId);

}
