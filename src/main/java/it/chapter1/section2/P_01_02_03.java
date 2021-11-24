package it.chapter1.section2;


import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.2.3　 编写一个 Interval2D 的用例，从命令行接受参数 N、min 和 max。生成 N 个随机的 2D 间隔，其宽
 * 和高均匀地分布在单位正方形中的 min 和 max 之间。用 StdDraw 画出它们并打印出相交的间隔对
 * 的数量以及有包含关系的间隔对数量。
 */
public class P_01_02_03 {
    public static void main(String[] args) {
        double min = 0.2;
        double max = 0.8;
        int N = 5;
        for (int i = 0; i < N; i++) {
            Interval2D interval2d = ramdomInterval2D(min, max);
            StdDraw.rectangle(interval2d.x.lo, interval2d.y.lo, interval2d.width() / 2, interval2d.height() / 2);
        }
    }

    public static class Interval1D {
        private double lo;

        private double hi;

        public Interval1D(double tlo, double thi) {
            if (tlo > thi) {
                double tempDouble = tlo;
                tlo = thi;
                thi = tempDouble;
            }
            this.hi = thi;
            this.lo = tlo;
        }

        public double length() {
            return Math.abs(lo - hi);
        }
        /*
         * 包含某个点
         * */

        public boolean contains(double x) {
            return (x > lo) && (x < hi);
        }


        @Override
        public String toString() {
            return "( " + lo + ", " + hi + " )";
        }

    }

    public static class Interval2D {
        public Interval1D x;

        public Interval1D y;

        public Interval2D(Interval1D tx, Interval1D ty) {
            this.x = tx;
            this.y = ty;
        }
        /*
         * 宽度
         * */

        public double width() {
            return x.length();
        }

        /*
         * 高度
         * */
        public double height() {
            return y.length();
        }

    }


    /***
     * 生成一个随机2D间隔，该间隔的长和宽都位于min和max之间
     * @param min
     * @param max
     * @return
     */
    public static Interval2D ramdomInterval2D(double min, double max) {
        double xMin = StdRandom.uniform(min, max);
        double xMax = StdRandom.uniform(min, max);
        double yMin = StdRandom.uniform(min, max);
        double yMax = StdRandom.uniform(min, max);

        Interval1D interval1d1 = new Interval1D(xMin, xMax);
        Interval1D interval1d2 = new Interval1D(yMin, yMax);
        Interval2D interval2d = new Interval2D(interval1d1, interval1d2);
        return interval2d;
    }

    /**
     * 判断是否相交
     *
     * @return
     */
    public static boolean isIntersect() {

        return false;
    }

    /**
     * 判断是否包含
     *
     * @return
     */
    public static boolean isInclude() {

        return false;
    }
}
