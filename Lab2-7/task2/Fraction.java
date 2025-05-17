package task2;

public class Fraction extends IntegerNumber2 {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException("Знаменник не може бути нулем");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Дріб + дріб
    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den).simplify();
    }

    // Дріб + ціле число (уникаємо конфлікту з IntegerNumber2.add)
    public Fraction addFraction(IntegerNumber2 other) {
        int num = this.numerator + (other.getValue() * this.denominator);
        return new Fraction(num, this.denominator).simplify();
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    private Fraction simplify() {
        int gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}