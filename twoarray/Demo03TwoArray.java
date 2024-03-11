package com.atguigu.twoarray;

import java.util.Scanner;

//键盘输入+遍历
public class Demo03TwoArray {
    public static void main(String[] args) {

        String[][] arr = new String[3][3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = sc.next();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
