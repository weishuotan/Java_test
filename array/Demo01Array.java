package com.atguigu.array;

public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化
        int[] arr1 = new int[3];
        String[] arr2 = new String[2];
        //静态初始化
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        String[] arr4 = new String[]{"你好"};
        //简化静态初始化
        int[] arr5 = {1, 2, 3, 4, 5};
        String[] arr6 = {"遥知兄弟登高处", "遍插茱萸少一人"};
        System.out.println(arr6[0] + arr6[1]);
    }
}
