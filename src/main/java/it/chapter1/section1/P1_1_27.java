package it.chapter1.section1;

/**
 * 二项分布。估计用以下代码计算 binomial(100, 50, 0.25) 将会产生的递归调用次数：
 * public static double binomial(int N, int k, double p)
 * {
 * if (N == 0 && k == 0) return 1.0;
 * if (N < 0 || k < 0) return 0.0;
 * return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
 * }
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 */
public class P1_1_27 {

    public static void main(String[] args) {
        System.out.println(binomial2(100, 50, 0.25));
    }

    /**
     * binomial(100, 50, 0.25)
     * 0.75 * binomial(99, 50, 0.25) + 0.25 * binomial(99, 49, 0.25)
     * 0.75 * binomial(98, 50, 0.25) + 0.25 * binomial(98, 49, 0.25) + 0.75 * binomial(98, 49, 0.25) + 0.25 * binomial(98, 48, 0.25)
     *
     * @param N
     * @param k
     * @param p
     * @return
     */
    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomial2(int N, int k, double p) {

        double[][] a = new double[N + 1][k + 1];
        a[0][0] = 1.0;
        int i, j;
        for (i = 1; i < N + 1; i++) {
            a[i][0] = a[i - 1][0] * (1 - p);
        }

        for (i = 1; i < N + 1; i++) {
            for (j = 1; j <= i && j < k + 1; j++) {
                a[i][j] = (1.0 - p) * a[i - 1][j] + p * a[i - 1][j - 1];
            }
        }
        return a[N][k];
    }

}
