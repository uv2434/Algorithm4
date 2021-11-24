package it.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Date {

    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
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

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = Integer.parseInt("2");
        int d = Integer.parseInt("30");
        int y = Integer.parseInt("2021");
        Date date = new Date(m, d, y);
        StdOut.println(date);
    }
}
