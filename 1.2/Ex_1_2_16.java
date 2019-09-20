/**
 * Define a class called Rational which can provide the functions of plus, minus, times, and divide. 
 */
import java.util.Scanner;

public class Ex_1_2_16{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rational a = new Rational(in.nextInt(), in.nextInt());
        Rational b = new Rational(in.nextInt(), in.nextInt());
        System.out.println(a.toString());
        System.out.println(b.toString());
        Rational pl = a.plus(b);
        System.out.println(pl.toString());
        Rational mi = a.minus(b);
        System.out.println(mi.toString());
        Rational ti = a.times(b);
        System.out.println(ti.toString());
        Rational di = a.divides(b);
        System.out.println(di.toString());
        in.close();
        }
}

class Rational{
    private int numerator;
    private int denominator;
    Rational(int numerator, int denominator){
        int m = numerator;
        int n = denominator;
        while(n != 0){
            int r = m % n;
            m = n;
            n = r;
        }
        this.numerator = numerator / m;
        this.denominator = denominator / m;
    }
    Rational plus(Rational b){
        int m = this.numerator * b.denominator + this.denominator * b.numerator;
        int n = this.denominator * b.denominator;
        return new Rational(m, n);
    }
    Rational minus(Rational b){
        int m = this.numerator * b.denominator - this.denominator * b.numerator;
        int n = this.denominator * b.denominator;
        return new Rational(m, n);
    }
    Rational times(Rational b){
        return new Rational(this.numerator * b.numerator, this.denominator * b.denominator);
    }
    Rational divides(Rational b){
        return new Rational(this.numerator * b.denominator, this.denominator * b.numerator);
    }
    boolean equals(Rational that)
    {
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }
    public String toString(){
        if (this.denominator == 1)
            return "" + numerator;
        else
            return numerator + "/" + denominator;
    }
}