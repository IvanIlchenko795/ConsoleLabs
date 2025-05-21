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

    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return simplify(new Fraction(num, den));
    }

    public Fraction addFraction(IntegerNumber2 other) {
        int num = this.numerator + other.getValue() * this.denominator;
        return simplify(new Fraction(num, this.denominator));
    }

    private Fraction simplify(Fraction f) {
        int gcd = gcd(f.numerator, f.denominator);
        return new Fraction(f.numerator / gcd, f.denominator / gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}