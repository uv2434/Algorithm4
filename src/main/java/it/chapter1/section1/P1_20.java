package it.chapter1.section1;

/**
 * 编写一个递归的静态方法计算 ln(N!) 的值。
 */
public class P1_20 {
    public static void main(String[] args) {
        System.out.println(ln(5));
    }

    /**
     * ln(5) = log(5) + ln(4)
     * @param N
     * @return
     */
    public static double ln(int N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + ln(N - 1);
    }
}
