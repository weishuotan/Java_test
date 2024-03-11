package com.atguigu.exercise;

//数组扩容
public class Demo09Exercise {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {0,0,0,0,0};
        int[] newarr = new int[10];


        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newarr[arr1.length+i] = arr2[i];
        }


        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }

    }
}
