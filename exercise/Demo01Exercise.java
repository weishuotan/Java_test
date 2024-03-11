package com.atguigu.exercise;

public class Demo01Exercise {
    public static void main(String[] args) {
        int[] arr = {2,33,22,34,25,54,34,24,99};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
