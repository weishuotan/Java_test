package com.atguigu.a_module10;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher =new Teacher();
        teacher.name="jack";
        teacher.age=18;
        System.out.println("teacher = " + teacher.name);
        System.out.println("teacher.age = " +teacher.age);
        teacher.work();
        //teacher.eat();  子类不能去调用父类的私有成员
        System.out.println("=================================");
        Manager manager =new Manager();
        manager.age=28;
        manager.name="Tom";
        System.out.println("manager = "+manager.name);
        System.out.println("manager.age = "+manager.age );
        manager.work();
    }



}
