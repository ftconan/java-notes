package com.atguigu.one;

/**
 * @Author magician
 * @Date 2024/5/1^
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String[] foods = new String[]{"a", "b", "c", "d"};
        System.out.println(foods[1]);

        String[] foods2 = new String[4];
        foods2[0] = "a";
        System.out.println(foods2[0]);
    }
}
