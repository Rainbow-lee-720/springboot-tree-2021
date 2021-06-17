package com.lee.tree.springbootxtree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TreeNode implements Serializable {

    private Integer id;

    private String name;

    private Integer pId;

    private Integer sort;

    private List<TreeNode> childNodes;
}
