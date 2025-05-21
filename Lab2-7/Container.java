import java.util.Arrays;

public abstract class Container<T extends Number> {
    protected T[] elements;

    public Container(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public abstract void sort();
    public abstract double process();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Вихiднi елементи: ").append(Arrays.toString(elements)).append("\n");
        sort();
        sb.append("Пiсля сортування: ").append(Arrays.toString(elements)).append("\n");
        sb.append("Сума елементiв: ").append(process()).append("\n");
        return sb.toString();
    }
}