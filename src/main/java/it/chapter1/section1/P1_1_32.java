package it.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * 直方图。假设标准输入流中含有一系列 double 值。编写一段程序，从命令行接受一个整数 N 和
 * 两个 double 值 l 和 r。将 (l，r) 分为 N 段并使用 StdDraw 画出输入流中的值落入每段的数量的
 * 直方图。
 */
public class P1_1_32 {
    public static void main(String[] args) {
        int N = 50;
        double [] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0 ;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
