package it.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1.2.4  以下这段代码会打印出什么？
 * String string1 = "hello";
 * String string2 = string1;
 * string1 = "world";
 * StdOut.println(string1);
 * StdOut.println(string2);
 */
public class P_01_02_04 {
    public static void main(String[] args) {
//        1.2.4  以下这段代码会打印出什么？
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
