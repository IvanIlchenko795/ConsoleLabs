package task3;

public class Subtraction extends AbstractOperation {
    public Subtraction(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculate() {
        return a - b;
    }

    @Override
    public String getDescription() {
        return "Вiднiмання: " + a + " - " + b;
    }
}