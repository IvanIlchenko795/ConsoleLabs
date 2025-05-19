public class IntContainer extends Container<Integer> {
    public IntContainer(Integer[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public double process() {
        int sum = 0;
        for (int val : elements) {
            sum += val;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Контейнер цiлих чисел:\n" + super.toString();
    }
}