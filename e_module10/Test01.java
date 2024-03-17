package com.atguigu.e_module10;
public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();
        //fu.methodZi();父类不能调用子类中的特有方法
        fu.method();
        System.out.println("===================================");
        Zi zi =new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();
        System.out.println("===================================");
        Fu fu1 =new Zi();
        fu1.method();
        fu1.methodFu();
    }
}
