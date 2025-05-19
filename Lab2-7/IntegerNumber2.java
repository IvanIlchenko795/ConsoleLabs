public class IntegerNumber2 {
    protected int value;

    public IntegerNumber2() {
        this.value = 0;
    }

    public IntegerNumber2(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int add(IntegerNumber2 other) {
        return this.value + other.value;
    }

    public int subtract(IntegerNumber2 other) {
        return this.value - other.value;
    }

    public int multiply(IntegerNumber2 other) {
        return this.value * other.value;
    }

    public int divide(IntegerNumber2 other) {
        if (other.value == 0) throw new ArithmeticException("Дiлення на нуль");
        return this.value / other.value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}