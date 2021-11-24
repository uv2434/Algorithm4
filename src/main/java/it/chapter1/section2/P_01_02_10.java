package it.chapter1.section2;


import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.2.10　 编写一个类 VisualCounter，支持加一和减一操作。它的构造函数接受两个参数 N 和 max，其
 * 中 N 指定了操作的最大次数，max 指定了计数器的最大绝对值。作为副作用，用图像显示每次计
 * 数器变化后的值。
 */
public class P_01_02_10 {

    public static class VisualCounter {
        private long N = 300;
        private double total = 0;

        public VisualCounter(long trails, double max) {
            StdDraw.setXscale(0, trails);
            StdDraw.setYscale(-max, max);
            StdDraw.setPenRadius(.005f);
        }

        public void increment() {
            N++;
            total++;
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(N, total);
        }

        public void decrement() {
            N++;
            total--;
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.point(N, total);
        }
    }

    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(3000, 1000);
        for (int i = 0; i < 100000; i++)
            if (StdRandom.uniform() > 0.5) {
                counter.increment();
            } else {
                counter.decrement();
            }
        StdOut.println(counter);
    }
}
