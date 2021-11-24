package it.chapter1.section1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.1.35  模拟掷骰子。以下代码能够计算每种两个骰子之和的准确概率分布：
 * int SIDES = 6;
 * double[] dist = new double[2*SIDES+1];
 * for (int i = 1; i <= SIDES; i++)
 * for (int j = 1; j <= SIDES; j++)
 * dist[i+j] += 1.0;
 * <p>
 * for (int k = 2; k <= 2*SIDES; k++)
 * dist[k] /= 36.0;
 * dist[i] 的值就是两个骰子之和为 i 的概率。用实验模拟 N 次掷骰子，并在计算两个 1 到
 * 6 之间的随机整数之和时记录每个值的出现频率以验证它们的概率。N 要多大才能够保证你
 * 的经验数据和准确数据的吻合程度达到小数点后三位？
 */
public class P1_1_35 {
    /**
     * 实验次数达到 100w 时，能够保证你的经验数据和准确数据的吻合程度达到小数点后三位
     *
     * @param args
     */
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入掷骰子的次数：");
        int number = sc.nextInt();
        double[] result = new double[2 * SIDES + 1];
        for (int i = 0; i < number; i += 2) {
            int a = (int) (Math.random() * SIDES) + 1;
            int b = (int) (Math.random() * SIDES) + 1;
            result[a + b] += 1.0;
        }

        for (int k = 2; k <= 2 * SIDES; k++) {

            // 除以2 表示为和的次数 为总掷骰子次数的一半
            result[k] /= (number / 2.0);
            System.out.println("真实情况下骰子数为" + k + "的概率:" + result[k]);

            dist[k] /= 36.0;
            System.out.println("理论情况下骰子数为" + k + "的概率:" + dist[k]);
            System.out.println("--------------");
        }
    }

}
