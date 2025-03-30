import java.util.ArrayList;
import java.util.Scanner;

public class Variant8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення розміру масиву
        System.out.print("Enter the array size: ");
        int num = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<>();

        // Заповнення масиву випадковими значеннями (-20 до 20)
        for (int i = 0; i < num; i++) {
            Arr.add((int) (Math.random() * 41) - 20);
        }

        // Виведення початкового масиву
        System.out.println("Initial array: " + Arr);

        // Знаходження мінімального та максимального значень
        int min = Arr.get(0), max = Arr.get(0);
        for (int val : Arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        // Видалення всіх входжень мінімального та максимального елементів
        final int minVal = min;
        final int maxVal = max;
        Arr.removeIf(val -> val == minVal || val == maxVal);

        // Виведення результату
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Array after deletion: " + Arr);

        sc.close();
    }
}