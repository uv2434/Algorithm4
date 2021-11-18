package it.chapter1.section1;

/**
 * 推测 exR1(6)的值
 */
public class p1_1_16 {
    public static void main(String[] args) {
        // f(n) = f(n - 3) + n + f(n -2) + n
        /**
         * f(0) = ""
         * f(1) = 11
         * f(2) = 22
         * f(3) = 3113
         * f(4) = 114224
         * f(5) = 22531135
         * f(6) = 311361142246
         */
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
