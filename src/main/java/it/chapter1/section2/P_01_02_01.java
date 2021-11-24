package it.chapter1.section2;


import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;

/**
 * 1.2.1　 编写一个 Point2D 的用例，从命令行接受一个整数 N。在单位正方形中生成 N 个随机点，然后计
 * 算两点之间的最近距离。
 */
public class P_01_02_01 {

    public static class Point2D {

        public double x;
        public double y;

        //初始化函数
        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        //计算两点之间的距离
        public double distTo(Point2D that) {
            double xDistance = this.x - that.x;
            double yDistance = this.y - that.y;
            return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        }
    }

    /**
     * Math.random() 为(0, 1) 之间的 double 值
     * @param args
     */
    public static void main(String[] args) {
        int N = StdIn.readInt();
        ArrayList<Point2D> points = new ArrayList<>();
        //创建N个元素的数组
        for (int i = 0; i < N; i++) {
            Point2D point2d = new Point2D(Math.random(), Math.random());
            points.add(point2d);
        }
        //计算第一个点到第二个点的距离, 作为初始值
        double resultDistince = points.get(0).distTo(points.get(1));

        for (int i = 0; i < N; i++) {
            Point2D point2d = points.get(i);
            for (int j = i + 1; j < N; j++) {
                //计算第i个点和第j个点之间的距离
                double distince = point2d.distTo(points.get(j));
                //如果距离比resultDistince小，就赋值给resultDistince
                resultDistince = Math.min(resultDistince, distince);
            }
        }
        System.out.println("resultDistince:" + resultDistince);
    }
}
