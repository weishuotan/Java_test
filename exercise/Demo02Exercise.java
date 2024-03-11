package com.atguigu.exercise;

import java.util.Random;

public class Demo02Exercise {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[10];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0 && arr[i]%5==0 && arr[i]%7!=0){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
