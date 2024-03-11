package com.atguigu.exercise;

import java.util.Scanner;

public class Demo07Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num = 0;
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("***********************");
        num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println(i);
                flag++;
            }
        }
        if(flag!=0){
            System.out.println("num = " +num);
        }
        else{
            System.out.println(-1);
        }
    }
}
