package it.chapter1.section1;

public class P1_1_17 {

    /**
     * 这段代码中的基础情况永远不会被访问。调用 exR2(3) 会产生调用 exR2(0)、exR2(-3) 和
     * exR2(-6)，循环往复直到发生 StackOverflowError。
     * @param n
     * @return
     */
    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
