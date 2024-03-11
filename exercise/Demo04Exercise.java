package com.atguigu.exercise;

import java.util.Scanner;

public class Demo04Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print("["+arr[0]+",");
            } else if (i==arr.length-1) {
                System.out.println(arr[arr.length-1]+"]");
            }else{
                System.out.print(arr[i]+",");
            }

        }
        
    }
}
