package com.atguigu.array;

public class Demo08Array {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,4,9};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("newarr[i] = " + newarr[i]);
        }
    }
}
