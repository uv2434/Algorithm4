package it.chapter1.section1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。然后用
 * printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数
 * 的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中率或者学生的考试分数
 * 制成表格。
 */
public class P1_1_21 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String name = scanner.next();
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println("|name| 击中 | 总击球 | 命中率 |");
            System.out.printf("|%2s | %-4d| %-6d| %.3f|\n", name, i, j, i * 1.0 / j);
        }
    }
}
