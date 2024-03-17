package com.atguigu.j_module10;

public class Person {
    int num = 10;
    public Person(){
        System.out.println("我是Person中的无参构造");
    }
    public Person(int data){
        this();
        System.out.println("我是Person中的有参构造");
    }

    public void method(){
        //super()在方法的第一行也会默认有无参构造方法
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
        this.method01();
        System.out.println("我是Person中的method方法");
    }

    public void method01(){
        System.out.println("我是Person中的method01方法");
    }
}
