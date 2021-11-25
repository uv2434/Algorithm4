package it.chapter1.section2;


import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.2.18　 累加器的方差。以下代码为 Accumulator 类添加了 var() 和 stddev() 方法，它们计算了
 * addDataValue() 方法的参数的方差和标准差，验证这段代码。
 * public class Accumulator
 * {
 * private double m;
 * private double s;
 * private int N;
 * public void addDataValue(double x)
 * {
 * N++;
 * s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
 * m = m + (x - m) / N;
 * }
 * public double mean()
 * {  return m;  }
 * public double var()
 * {  return s/(N - 1);  }
 * public double stddev()
 * {  return Math.sqrt(this.var());  }
 * }
 * 与直接对所有数据的平方求和的方法相比较，这种实现能够更好地避免四舍五入产生的误差。
 */
public class P_01_02_18 {

    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator();
        for (int i = 0; i < 10000; i++) {
            accumulator.addDataValue(StdRandom.random());
        }
        System.out.println("result:" + accumulator);

    }

    public static class Accumulator {
        private double m;
        private double s;
        private int N;


        public void addDataValue(double x) {
            N++;
            s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
            m = m + (x - m) / N;
        }

        public double mean() {
            return m;
        }

        public double var() {
            return s / (N - 1);
        }

        public double stddev() {
            return Math.sqrt(this.var());
        }

        @Override
        public String toString() {
            return "Accumulator{" +
                    "m=" + m +
                    ", s=" + s +
                    ", N=" + N +
                    '}';
        }
    }
}
