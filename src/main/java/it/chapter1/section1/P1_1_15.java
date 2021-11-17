package it.chapter1.section1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 　 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小
 * 为M 的数组，其中第i 个元素的值为整数i 在参数数组中出现的次数。如果a[] 中的值均在0 到M-1
 * 之间，返回数组中所有元素之和应该和 a.length 相等。
 */
public class P1_1_15 {

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2, 10};
        int[] result = histogram(a, 20);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] histogram(int[] a, int M) {
        int[] res = new int[M];
        for (int i : a) {
            if (i >= 0 && i < M) {
                res[i]++;
            }
        }
        return res;
    }
}
