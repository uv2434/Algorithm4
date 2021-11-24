package it.chapter1.section2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Whitelist {

    public static void main(String[] args) {
        int[] w = {1, 2, 3, 4, 5, 6, 7, 8};
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {  // 读取键，如果不在白名单中则打印它
            int key = StdIn.readInt();
            if (!set.contains(key))
                StdOut.println(key);
        }
    }
}
