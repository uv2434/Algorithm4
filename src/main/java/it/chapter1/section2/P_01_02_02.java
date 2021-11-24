package it.chapter1.section2;

import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;

/**
 * 1.2.2　 编写一个 Interval1D 的用例，从命令行接受一个整数 N。从标准输入中读取 N 个间隔（每个间隔
 * 由一对 double 值定义）并打印出所有相交的间隔对。
 *
 *
 */
public class P_01_02_02 {
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

        /***
         * 判断两个间隔是否相交， 其有公共部分即可认为相交
         * @param that
         * @return
         */
        public boolean intersect(Interval1D that) {
            if (this.hi < that.lo) {
                return false;
            } else if ((this.hi > that.lo) && (this.lo < that.hi)) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return "( " + lo + ", " + hi + " )";
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入N:");
        int N = StdIn.readInt();

        ArrayList<Interval1D> interval1ds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("请输入Intervel的lo:");
            double tlo = StdIn.readDouble();
            System.out.println("请输入Intervel的hi:");
            double thi = StdIn.readDouble();
            Interval1D interval1d = new Interval1D(tlo, thi);
            interval1ds.add(interval1d);
        }

        for (int i = 0; i < interval1ds.size(); i++) {
            for (int j = i + 1; j < interval1ds.size(); j++) {
                Interval1D tempInterval1d1 = interval1ds.get(i);
                Interval1D tempInterval1d2 = interval1ds.get(j);
                if (tempInterval1d1.intersect(tempInterval1d2)) {
                    System.out.println("intersect:" + tempInterval1d1 + " " + tempInterval1d2);
                }
            }
        }
    }
}
