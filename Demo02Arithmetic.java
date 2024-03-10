package com.atguigu.arithmetic;

public class Demo02Arithmetic {
    public static void main(String[] args) {
        int i=10;
        int j=3;

        System.out.println(i+j+"");//13 实际上是一个字符串
        System.out.println(i+j+""+1);//131 先执行i+j得到13由于引进了字符串1直接写在了13的后面
        System.out.println(i+""+j);//103
        System.out.println("i+j="+(i+j));
    }
}
