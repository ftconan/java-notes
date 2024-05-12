package com.atguigu.collection;


import java.util.*;

/**
 * @Author magician
 * @Date 2024/5/12
 * @Version 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        // 或者同时声明和初始化
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 创建一个HashSet实例
        Set<String> uniqueWords = new HashSet<>();

        // 添加元素到Set
        uniqueWords.add("Hello");
        uniqueWords.add("World");
        uniqueWords.add("Java");
        uniqueWords.add("Hello"); // "Hello" 已存在，所以不会添加

        // 输出Set的大小
        System.out.println("Set size: " + uniqueWords.size());

        // 遍历Set
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // 检查元素是否存在
        boolean containsJava = uniqueWords.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // 删除元素
        uniqueWords.remove("World");

        // 检查删除后Set的大小
        System.out.println("Set size after removal: " + uniqueWords.size());

        // 创建一个HashMap实例
        Map<String, Integer> studentGrades = new HashMap<>();

        // 添加键值对
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);
        studentGrades.put("Alice", 95); // 更新 Alice 的成绩

        // 输出Map的大小
        System.out.println("Map size: " + studentGrades.size());

        // 遍历Map
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // 获取特定键的值
        int bobGrade = studentGrades.get("Bob");
        System.out.println("Bob's grade: " + bobGrade);

        // 检查键是否存在
        boolean hasAlice = studentGrades.containsKey("Alice");
        System.out.println("Has 'Alice': " + hasAlice);

        // 删除键值对
        studentGrades.remove("Charlie");

        // 检查删除后Map的大小
        System.out.println("Map size after removal: " + studentGrades.size());

        // 创建一个未排序的整数列表
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));

        // 打印原始列表
        System.out.println("Original List: " + numbers1);

        // 使用Collections.sort()进行排序
        Collections.sort(numbers1);

        // 打印排序后的列表
        System.out.println("Sorted List: " + numbers1);

        // 使用Collections.reverse()反转列表
        Collections.reverse(numbers1);

        // 打印反转后的列表
        System.out.println("Reversed List: " + numbers1);

        // 使用Collections.max()找出最大值
        int maxNumber = Collections.max(numbers1);
        System.out.println("Max Number: " + maxNumber);

        // 使用Collections.min()找出最小值
        int minNumber = Collections.min(numbers1);
        System.out.println("Min Number: " + minNumber);

        // 使用Collections.copy()复制列表
        System.out.println(numbers1.size());
        List copy = Arrays.asList(new Object[numbers1.size()]); // 为copy分配与numbers1相同大小的空间
//        List<Integer> copy = new ArrayList<>(numbers1.size()); // 为copy分配与numbers1相同大小的空间
        Collections.copy(copy, numbers1); // 然后复制numbers1的元素到copy中
        System.out.println("Copied List: " + copy);
    }
}
