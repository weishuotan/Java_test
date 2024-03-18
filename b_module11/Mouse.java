package com.atguigu.b_module11;

public class Mouse implements USB {
    public void open()
    {
        System.out.println("鼠标打开");
    }
    public String close(){
        return "鼠标关闭";
    }
}
