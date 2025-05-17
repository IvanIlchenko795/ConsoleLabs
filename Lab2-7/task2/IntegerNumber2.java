package task2;

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

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}