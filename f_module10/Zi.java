package com.atguigu.f_module10;

public class Zi extends Fu{
    @Override
    public void method(){
        System.out.println("我是子类中的method方法");
    }
    public void methodZi(){
        System.out.println("我是子类中的methodZi方法");
    }
    @Override
    public void method01(){

    }
    /*@Override
    public void method02(){

    }*/
    @Override
    public Zi method03(){
        return null;
    }
}
