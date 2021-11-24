package it.chapter1.section1;

import java.util.Arrays;

/**
 * 1.1.33  矩阵库。编写一个 Matrix 库并实现以下 API：
 * public class Matrix
 * static     double dot(double[] x, double[] y)  向量点乘
 * static double[][] mult(double[][] a, double[][] b)  矩阵和矩阵之积
 * static double[][] transpose(double[][] a)  转置矩阵
 * static   double[] mult(double[][] a, double[] x)  矩阵和向量之积
 * static   double[] mult(double[] y, double[][] a)  向量和矩阵之积
 * 编写一个测试用例，从标准输入读取矩阵并测试所有方法。
 */
public class P1_1_33 {
    public static double dot(double[] x, double[] y) {
        return 0.1;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { // Compute dot product of row i and
                // column j.
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a) {
        int N = a.length;//row
        int M = a[0].length;//column
        double[][] c = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) { // Compute dot product of row i and
                // column j.
                c[i][j] = a[j][i];
            }
        }
        return c;
    }

    //矩阵和向量之积
    public static double[] mult(double[][] a, double[] x) {
        int N = a.length;
        int M = a[0].length;
        double[] c = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) { // Compute dot product of row i and
                // column j.
                c[i] += a[i][j] * x[j];
            }
        }
        return c;
    }

    //向量和矩阵之积
    public static double[] mult(double[] y, double[][] a) {
        int N = a.length;
        int M = a[0].length;
        double[] c = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) { // Compute dot product of row i and
                // column j.
                c[i] += a[i][j] * y[j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        double[][] a = {{20, 5}, {3, 5}, {3, 3}};
        double[] b = {2, 1};
        int N = a.length;
        double[] c = mult(a, b);
        System.out.println(Arrays.toString(c));
    }
}
