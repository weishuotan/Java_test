package com.atguigu.c_module11;

public class Mouse implements USB {
    //default只能在接口中出现，干掉default依然是重写
    @Override
    public void methodDef(){
        System.out.println("我是重写接口中的默认方法");
    }
}
