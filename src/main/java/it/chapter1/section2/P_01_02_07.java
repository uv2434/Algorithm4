package it.chapter1.section2;


/**
 * 1.2.7  以下递归函数的返回值是什么？
 * public static String mystery(String s)
 * {
 * int N = s.length();
 * if (N <= 1) return s;
 * String a = s.substring(0, N/2);
 * String b = s.substring(N/2, N);
 * return mystery(b) + mystery(a);
 * }
 */
public class P_01_02_07 {

    public static void main(String[] args) {
        String s = mystery("hello world");
        System.out.println(s);
    }

    /**
     *  mystery("llo") + mystery("he")
     *  mystery("lo") + mystery("l") + mystery("e") + mystery("h")
     *  mystery("o") + mystery("l") + "l" + "e" + "h"
     *
     * @param s
     * @return
     */
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }
}
