package it.chapter1.section1;

public class P1_19_Fibonacci {

    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }

    public static long f(int N) {
        if (N < 2) {
            return N;
        }
        int[] res = new int[N + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= N; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[N];
    }

    public static void main(String[] args) {
//        System.out.println(f(3));
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + f(N));
        }
    }
}
