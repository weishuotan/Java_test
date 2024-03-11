package com.atguigu.twoarray;

import java.util.Scanner;

//键盘输入+遍历
public class Demo04TwoArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];


        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{1,2};
        arr[2] = new int[]{1,2,3,4};


        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
