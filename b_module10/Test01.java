package com.atguigu.b_module10;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        //System.out.println(fu.numZi);父类不能调用子类中的特有成员

        System.out.println("====================================");

        Zi zi =new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);//继承了父类可以使用父类中的非私有成员
    }
}
