package com.atguigu.exercise;

import java.util.Random;
import java.util.Scanner;

public class Demo06Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("***********************");
        num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println(i);
            }
        }
    }
}
