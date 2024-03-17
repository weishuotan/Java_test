package com.atguigu.l_module10;

public class Employee {
    private String name;
    private int age;

    public Employee(){

    }

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void work(){
        System.out.println("工作");
    }
}
