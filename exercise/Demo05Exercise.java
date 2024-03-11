package com.atguigu.exercise;

import java.util.Random;
import java.util.Scanner;

public class Demo05Exercise {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[50];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100)+1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
