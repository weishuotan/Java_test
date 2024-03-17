package com.atguigu.m_module10;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃骨头");
    }
    @Override
    public void drink(){
        System.out.println("猫喝水");
    }
}
