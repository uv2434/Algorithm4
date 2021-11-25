package it.chapter1.section2;


import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/**
 * 1.2.15  文件输入。基于 String 的 split() 方法实现 In 中的静态方法 readInts()。
 * 解答：
 * public static int[] readInts(String name)
 * {
 * In in = new In(name);
 * String input = in.readAll();
 * String[] words = input.split("\\s+");
 * int[] ints = new int[words.length];
 * for(int i = 0; i < word.length; i++)
 * ints[i] = Integer.parseInt(words[i]);
 * return ints;
 * }
 * 我们会在 1.3 节中学习另一个不同的实现（请见 1.3.1.5 节）。
 */
public class P_01_02_15 {

    public static void main(String[] args) {
        System.out.println("T:\\IdeaProjects\\Green\\algorithm\\src\\main\\resources\\ints.txt");

        //若要此方法有效，请先保证"/Users/kyson/"目录下有"ints.txt"文件
        int[] ints = readInts("T:\\IdeaProjects\\Green\\algorithm\\src\\main\\resources\\ints.txt");
        System.out.println(Arrays.toString(ints));
    }

    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
}
