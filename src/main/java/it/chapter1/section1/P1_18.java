package it.chapter1.section1;


/**
 * mystery(2,  25) 和 mystery(3,  11) 的返回值是多少？给定正整数 a 和 b，mystery(a,b)
 * 计算的结果是什么？将代码中的 + 替换为 * 并将 return  0 改为 return  1，然后回答相同
 * 的问题。
 */
public class P1_18 {

    /**
     * mystery(2, 25)
     * mystery(4, 12) + 2
     * mystery(8, 6)
     * mystery(16, 3)
     * mystery(32, 1) + 16
     * mystery(64, 0) + 32
     * 0   mystery(2, 25) = 0 + 32 + 2 = 50
     * mystery(a, b) = ab
     *
     * mystery(3, 11)
     * mystery(6, 5) + 3
     * mystery(12, 2) + 6
     * mystery(24, 1)
     * mystery(48, 0) + 24
     * 0
     *
     * mystery(a, b) = ab
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    /**
     * mystery2(2, 25)
     * mystery(2^2, 12) * 2
     * mystery(2^4, 6)
     * mystery(2^8, 3)
     * mystery(2^16, 1) * 2^8
     * mystery(2^32, 0) * 2^16
     * 1   2^25
     *
     * mystery2(3, 11)
     * mystery2(3^2, 5) * 3
     * mystery2(3^4, 2) * 3^2
     * mystery2(3^8, 1)
     * mystery2(3^16, 0) * 3^8
     * 1   3^11
     * mystery2(a, b) = a^b
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        }
        return mystery2(a * a, b / 2) * a;
    }

    public static void main(String[] args) {
        System.out.println(mystery2(2, 25));
    }
}
