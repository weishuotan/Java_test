package com.atguigu.array;

public class Demo03Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1]=10;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        arr[0]=50;
        String[] arr2 = new String[3];
        arr2[0]="tom";
        arr2[2]="lucy";
        arr2[1]="jack";
        System.out.println(arr[4]);
        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);
        System.out.println(arr2[2]);
        System.out.println(arr2[1]);
        System.out.println(arr2[0]);
    }
}
