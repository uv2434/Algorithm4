package it.chapter1.section1;

/**
 * 编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log 2 N 的最大整数。不要使用 Math 库。
 */
public class P1_1_14 {

    public static void main(String[] args) {
        System.out.println(lg(7));
    }

    public static int lg(int N) {
        int num = 0;
        while (N / 2 != 0) {
            N /= 2;
            num++;
        }
        return num;
    }
}
