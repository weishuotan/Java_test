package com.atguigu.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
       //单独使用
        int i = 1;
        i++;
        System.out.println("i = " + i);

        int j = 1;
        ++j;
        System.out.println("j = " + j);

        //混合使用
        int m = 100;
        int result = ++m;
        System.out.println("result = " + result);
        System.out.println("m = " + m);

        int n = 100;
        int result2 = n++;
        System.out.println("result2 = " + result2);
        System.out.println("n = " +n);

        int z = 100;
        System.out.println(z++);
        System.out.println(z);

        int x = 10;
        int y = 20;
        int result3 = x++ + --y + ++x;//10+19+12
        System.out.println("result3 = " + result3);

        int c = 10;
        c = c++;
        System.out.println("c = " + c);//10
    }
}
