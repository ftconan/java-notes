package com.atguigu.thread;

/**
 * @Author magician
 * @Date 2024/5/10
 * @Version 1.0
 */
public class StringBuildTest {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            char c = (char) ('A' + i);
            sb.append(c);
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.substring(0, 5));
        System.out.println(sb.substring(0, 5));
        System.out.println(sb);
    }
}
