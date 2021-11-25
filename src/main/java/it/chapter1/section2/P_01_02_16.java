package it.chapter1.section2;

public class P_01_02_16 {

    public static void main(String[] args) {
        Rational rational1 = new Rational(3, -4);
        Rational rational2 = new Rational(5, 6);
        Rational result1 = rational1.plus(rational2);
        Rational result2 = rational1.minus(rational2);
        Rational result3 = rational1.times(rational2);
        Rational result4 = rational1.devides(rational2);
        System.out.println("plus:" + result1);
        System.out.println("minus:" + result2);
        System.out.println("times:" + result3);
        System.out.println("devides:" + result4);
    }

    public static class Rational {

        private int nume; // 分子
        private int deno; // 分母

        /**
         * 初始化时进行约分
         *
         * @param numerator
         * @param denominator
         */
        public Rational(int numerator, int denominator) {
            // 使用断言防止溢出
            assert (numerator < Integer.MAX_VALUE && numerator > Integer.MIN_VALUE);
            assert (denominator < Integer.MAX_VALUE && denominator > Integer.MIN_VALUE);
            int g = gcd(numerator, denominator);

            this.nume = numerator / g;
            this.deno = denominator / g;
        }

        public static int gcd(int m, int n) {
            int rem = 0;
            rem = m % n;
            if (0 == rem) {
                return n;
            }
            return gcd(n, rem);
        }

        /**
         * 加法
         *
         * @param b
         * @return
         */
        public Rational plus(Rational b) {
            int numerator = this.nume * b.deno + b.nume * this.deno;
            int denominator = this.deno * b.deno;
            Rational rational = new Rational(numerator, denominator);
            return rational;
        }

        /**
         * 减法
         *
         * @param b
         * @return
         */
        public Rational minus(Rational b) {
            int numerator = this.nume * b.deno - b.nume * this.deno;
            int denominator = this.deno * b.deno;
            Rational rational = new Rational(numerator, denominator);
            return rational;
        }

        /**
         * 乘法
         *
         * @param b
         * @return
         */
        public Rational times(Rational b) {
            int numerator = this.nume * b.nume;
            int denominator = this.deno * b.deno;
            Rational rational = new Rational(numerator, denominator);
            return rational;
        }

        /**
         * 除法
         *
         * @param b
         * @return
         */
        public Rational devides(Rational b) {

            int numerator = this.nume * b.deno;
            int denominator = this.deno * b.nume;
            Rational rational = new Rational(numerator, denominator);
            return rational;
        }

        public boolean equals(Rational b) {
            if (this == b) return true;
            if (b == null) return false;
            if (this.getClass() != b.getClass()) return false;
            return (nume == b.nume && deno == b.deno);
        }

        public String toString() {
            return this.nume + "/" + this.deno;
        }
    }
}
