package com.atguigu.i_module10;

public class Test01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        System.out.println("=================");
        Zi zi1 = new Zi(10);
        System.out.println("=================");
        Zi zi2 = new Zi();
        zi2.method();
    }
}
