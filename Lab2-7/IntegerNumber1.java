public class IntegerNumber1 {
    private int value;

    public IntegerNumber1() {
        this.value = 0;
    }

    public IntegerNumber1(int value) {
        this.value = value;
    }

    public int add(IntegerNumber1 other) {
        return this.value + other.value;
    }

    public int subtract(IntegerNumber1 other) {
        return this.value - other.value;
    }

    public int multiply(IntegerNumber1 other) {
        return this.value * other.value;
    }

    public int divide(IntegerNumber1 other) {
        if (other.value == 0) throw new ArithmeticException("Дiлення на нуль");
        return this.value / other.value;
    }

    public void printOperations(IntegerNumber1 other) {
        System.out.println("Сума: " + add(other));
        System.out.println("Рiзниця: " + subtract(other));
        System.out.println("Добуток: " + multiply(other));
        System.out.println("Частка: " + divide(other));
    }
}