package it.chapter1.section2;

/**
 * 1.2.6　 如果字符串 s 中的字符循环移动任意位置之后能够得到另一个字符串 t，那么 s 就被称为 t 的回
 * 环变位（circular rotation）。例如，ACTGACG 就是 TGACGAC 的一个回环变位，反之亦然。判定这
 * 个条件在基因组序列的研究中是很重要的。编写一个程序检查两个给定的字符串 s 和 t 是否互为
 * 回环变位。提示：答案只需要一行用到 indexOf()、length() 和字符串连接的代码。
 */
public class P_01_02_06 {

    public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (t + t).contains(s);
    }

    public static void main(String[] args) {
        String s = "ASDFASAAAD";
        String t = "ASAAADASDF";
        boolean isCircularRotation = isCircularRotation(s, t);
        System.out.println("isCircularRotation:" + (isCircularRotation ? "YES" : "NO"));
    }
}
