package it.chapter1.section1;

/**
 * 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）。
 */
public class P1_1_13 {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        convert(a);
    }

    public static void convert(int[][] a) {

        int N = a.length;
        int M = a[0].length;

        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
