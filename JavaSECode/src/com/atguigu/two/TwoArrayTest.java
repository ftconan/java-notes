package com.atguigu.two;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
