package com.lee.tree.springbootxtree.exception;

import lombok.Getter;

@Getter
public class MyException extends Exception {

    private String msg;

    public MyException(String message) {
        this.msg = message;
    }

}
