import java.util.Scanner;

public class FunctionCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення значень a та m
        System.out.print("Введіть a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть m: ");
        double m = sc.nextDouble();
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();

        // Обчислення g за умовами
        double g;
        if (a < m) {
            g = a * Math.pow(m, 2);
        } else {
            g = Math.pow(m, 3) + Math.exp(-a * m);
        }

        // Обчислення y за умовами
        double y;
        if (x == g) {
            y = x;
        } else {
            y = 2 - (Math.pow(x, 2) / 9) - g;
        }

        // Виведення результатів
        System.out.println("g = " + g);
        System.out.println("y = " + y);

        sc.close();
    }
}