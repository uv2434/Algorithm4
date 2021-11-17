package it.chapter1.section1;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {  // 数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new int[]{1, 2, 3, 4, 5};
        Arrays.sort(whitelist);
        int key = 5;
        System.out.println(rank(key, whitelist));

        double a = 2.0e-6 * 100000000.1;
        System.out.println(a);
        System.out.println(true && false || true && true);


    }
}

