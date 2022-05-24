package com.dna;

import java.util.Arrays;

/**
 * 数组元素的添加
 *
 * 解决数组长度不可变的问题
 */
public class Case02 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7};

        System.out.println("添加前，arr is "+Arrays.toString(arr));
        // 要加入数组的目标元素
        int dst = 6;

        // 创建一个新数组，长度是原数组长度+1
        int[] newArr = new int[arr.length+1];

        // 把原数组中的数据全部复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 把目标元素放入到新数组的最后
        newArr[newArr.length-1] = dst;

        // 新数组替换原数组
        arr = newArr;

        System.out.println("添加后, arr is "+Arrays.toString(arr));
    }
}
