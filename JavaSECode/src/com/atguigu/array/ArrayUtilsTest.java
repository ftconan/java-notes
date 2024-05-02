package com.atguigu.array;

import java.util.Arrays;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));
    }
}
