package com.atguigu.exercise;

import java.util.Random;
import java.util.Scanner;

public class Demo03Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
