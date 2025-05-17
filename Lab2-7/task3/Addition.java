package task3;

public class Addition extends AbstractOperation {
    public Addition(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculate() {
        return a + b;
    }

    @Override
    public String getDescription() {
        return "Додавання: " + a + " + " + b;
    }
}