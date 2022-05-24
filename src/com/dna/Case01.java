package com.dna;

/**
 * 数组的基本使用
 */
public class Case01 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr1 = new int[3];

        System.out.println("========== 获取数组长度 ==========");
        System.out.println("数组长度是"+arr1.length);

        System.out.println("========== 访问数组中的元素，数组名[下标] ==========");
        int element0 = arr1[0];
        System.out.println("element0 is "+element0);

        System.out.println("========== 为数组中的元素赋值 ==========");
        arr1[0] = 99;
        System.out.println("element0 is "+arr1[0]);

        System.out.println("========== 遍历数组 ==========");
        arr1[1] = 98;
        arr1[2] = 97;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1 element is "+arr1[i]);
        }

        System.out.println("========== 创建数组时同时赋值 ==========");
        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println("arr2 length is "+arr2.length);
    }
}
