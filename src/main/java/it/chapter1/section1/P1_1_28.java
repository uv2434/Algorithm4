package it.chapter1.section1;

/**
 * 1.1.28 删除重复元素。修改 BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。
 */
public class P1_1_28 {

    public static int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[j] != a[i]) {
                a[++j] = a[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 5, 8, 9, 10};
        int index = removeDuplicates(a);
        for (int i = 0; i < index; i++) {
            System.out.println(a[i]);
        }
    }
}
