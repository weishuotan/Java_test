package com.atguigu.array;

public class Demo10Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 9};
        int[] arr2 = new int[3];
        System.out.println(arr2.length);
        arr2 = null;
        System.out.println(arr2.length);
    }
}
