package it.chapter1.section1;

import java.util.Arrays;

/**
 * 1.1.34　 过滤。以下哪些任务需要（在数组中，比如）保存标准输入中的所有值？哪些可以被实现为一
 * 个过滤器且仅使用固定数量的变量和固定大小的数组（和 N 无关）？在每个问题中，输入都来
 * 自于标准输入且含有 N 个 0 到 1 的实数。
 * 打印出最大和最小的数
 * 打印出所有数的中位数
 * 打印出第 k 小的数，k 小于 100
 * 打印出所有数的平方和
 * 打印出 N 个数的平均值
 * 打印出大于平均值的数的百分比
 * 将 N 个数按照升序打印
 * 将 N 个数按照随机顺序打印
 */
public class P1_1_34 {

    public static double maximun(double[] a) {

        double m = a[0];

        for (int i = 0; i < a.length; ++i) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

    public static double minimum(double[] a) {
        if (a.length < 1) {
            return Double.parseDouble(null);
        }

        final double[] m = {a[0]};
        Arrays.stream(a).forEach(i -> {
            if (i < m[0]) {
                m[0] = i;
            }
        });
        return m[0];
    }


    public static double median(double[] a) {
        // 先排序
        Arrays.sort(a);
        // 如果是偶数，则为中间两个数的和除以2
        if (a.length % 2 == 0) {
            return (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
        }
        // 否则就是中间这个数
        return a[a.length / 2];
    }

    public static void main(String[] args) {
        double a[] = {0.1, 0.3, 0.4, 0.5, 0.9, 0.001, 0.7};
        System.out.println(maximun(a));
        System.out.println(minimum(a));
        System.out.println(median(a));
    }
}
