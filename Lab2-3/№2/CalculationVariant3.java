import java.util.Scanner;

public class CalculationVariant3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення змінних
        System.out.print("input T: ");
        double T = sc.nextDouble();
        System.out.print("input a: ");
        double a = sc.nextDouble();
        System.out.print("input b: ");
        double b = sc.nextDouble();

        double hx = 3;
        double xmax = -T, xmin = -T;
        double MAX = Double.NEGATIVE_INFINITY;
        double MIN = Double.POSITIVE_INFINITY;

        for (double x = -T; x <= T; x += hx) {
            double s = Math.cos(x + a) + Math.pow(b, 3);
            double z = Math.pow(x, 5) + a * s + Math.pow(b, 3);
            
            System.out.println("s=" + s + " z=" + z + " x=" + x);

            if (z > MAX) {
                MAX = z;
                xmax = x;
            }
            if (z < MIN) {
                MIN = z;
                xmin = x;
            }
        }

        // Виведення максимального і мінімального значень
        System.out.println("MAX = " + MAX + " при x = " + xmax);
        System.out.println("MIN = " + MIN + " при x = " + xmin);
        
        sc.close();
    }
}