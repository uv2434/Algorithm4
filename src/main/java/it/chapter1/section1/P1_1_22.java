package it.chapter1.section1;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。每当该方法
 * 被调用时，打印出它的参数 lo 和 hi 并按照递归的深度缩进。提示：为递归方法添加一个参数
 * 来保存递归的深度。
 */
public class P1_1_22 {

    public static int rank(int key, int[] a) {
        System.out.println("-----------------------");
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {  //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        depth++;
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println(lo + "," + hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 24};
        int key = 5;
        System.out.println(rank(key, a));
    }
}
