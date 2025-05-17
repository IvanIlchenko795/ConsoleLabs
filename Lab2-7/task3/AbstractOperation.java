package task3;

public abstract class AbstractOperation {
    protected int a;
    protected int b;

    public AbstractOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int calculate();

    public String getDescription() {
        return "Операцiя з числами: " + a + " і " + b;
    }
}