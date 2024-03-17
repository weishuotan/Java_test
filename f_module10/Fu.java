package com.atguigu.f_module10;

public class Fu {
    public void methodFu(){
        System.out.println("我是夫类中的methodFu方法");
    }
    public  void method(){
        System.out.println("我是夫类中的method方法");
    }
    void method01(){
        System.out.println("我是夫类中的权限为默认的方法");
    }
    public static void method02(){
        System.out.println("我是夫类中的权限为静态的方法");
    }
    public Fu method03(){
        return null;
    }
}
