package it.chapter1.section1;

/**
 * 数组练习。编写一段程序，创建一个 N×N 的布尔数组 a[][]。其中当 i 和 j 互质时（没有相同
 * 因子），a[i][j] 为 true，否则为 false。
 */
public class P1_1_30 {

    public static void main(String[] args) {

        int N = 5;
        boolean[][] res = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = false;
                } else {
                    res[i][j] = isRelativelyPrime(i, j);
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        return gcd(j, i % j);
    }

    public static boolean isRelativelyPrime(int i, int j) {
        return gcd(i, j) == 1 ? true : false;
    }
}
