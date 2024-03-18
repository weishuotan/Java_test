package com.atguigu.c_module11;

public interface USB {
    public default void methodDef(){
        System.out.println("我是默认方法");
    }
}
