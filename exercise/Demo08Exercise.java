package com.atguigu.exercise;

import java.util.Scanner;
//数组扩容
public class Demo08Exercise {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        //将新数组的地址给老数组
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
