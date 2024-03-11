package com.atguigu.array;

import java.util.Random;

public class Demo06Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);;
        }

        int[] arr1 = new int[3];
        System.out.println(arr1);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = new int[3];
        arr[1]=10;
        arr[2]=20;
        arr[0]=30;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
