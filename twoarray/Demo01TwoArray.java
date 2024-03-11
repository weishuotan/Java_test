package com.atguigu.twoarray;

public class Demo01TwoArray {
    public static void main(String[] args) {
        String[][] arr = {{"六九","李四"},{"小六","王五","张三"},{"里斯"}};

        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length);
        }

    }
}
