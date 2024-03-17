package com.atguigu.i_module10;

public class Zi extends Fu{
    int num = 100;
    public Zi(){
        super();
        System.out.println("我是子类中的无参构造");
    }

    public Zi(int num){
        super();
        System.out.println("我是子类中的有参构造");
    }

    public void method(){
        super.method();
        System.out.println("我是子类中的method方法");
        System.out.println(num);
        System.out.println(super.num);

    }






}
