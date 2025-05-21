public class DoubleContainer extends Container<Double> {
    public DoubleContainer(Double[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        for (int i = 1; i < elements.length; i++) {
            double key = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key;
        }
    }

    @Override
    public double process() {
        double sum = 0;
        for (double val : elements) {
            sum += val;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Контейнер дiйсних чисел:\n" + super.toString();
    }
}