package it.chapter1.section2;

import java.util.Scanner;

/**
 * 1.2.11  根据 Date 的 API 实现一个 SmartDate 类型，在日期非法时抛出一个异常。
 */
public class P_01_02_11 {

    public static class SmartDate {
        private final int year;
        private final int month;
        private final int day;
        private static final int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public SmartDate(int m, int d, int y) {
            if (!validate(m, d, y))
                throw new IllegalArgumentException("Argument illegal " + m + "/" + d + "/" + y);
            this.day = d;
            this.year = y;
            this.month = m;
        }

        public int month() {
            return month;
        }

        public int day() {
            return day;
        }

        public int year() {
            return year;
        }

        private boolean validate(int m, int d, int y) {
            if (y == 0 || y < -1000 || y > 10000)
                return false;
            if (m < 1 || m > 12)
                return false;
            if (d < 1 || d > 31)
                return false;
            if (d > months[m])
                return false;
            if (!isLeapYear() && d > 28)
                return false;
            return true;
        }

        private boolean isLeapYear(int y) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                return true;
            } else {
                return false;
            }
        }

        private boolean isLeapYear() {
            return isLeapYear(year);
        }

        public boolean equals(Object x) {
            if (this == x) return true;
            if (x == null) return false;
            if (this.getClass() != x.getClass()) return false;
            SmartDate that = (SmartDate) x;
            if (this.day != that.day) return false;
            if (this.month != that.month) return false;
            if (this.year != that.year) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = hash * 31 + month;
            hash = hash * 31 + day;
            hash = hash * 31 + year;
            return hash;
        }

        public String toString() {
            return month + "/" + day + "/" + year;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入年月日");
        Scanner scanner1 = new Scanner(System.in);
        String y = scanner1.next();
        Scanner scanner2 = new Scanner(System.in);
        String m = scanner2.next();
        Scanner scanner3 = new Scanner(System.in);
        String d = scanner3.next();
        SmartDate smartDate = new SmartDate(Integer.valueOf(m), Integer.valueOf(d), Integer.valueOf(y));
        System.out.println(smartDate);

    }
}
