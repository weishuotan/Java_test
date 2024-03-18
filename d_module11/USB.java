package com.atguigu.d_module11;

public interface USB {
    public default void method(){
        System.out.println("我是默认方法");
    }
    public static void methodSta(){
        System.out.println("我是接口中的静态方法");
    }
}
