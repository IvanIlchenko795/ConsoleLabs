import java.util.Scanner;

public class CalculationVariant8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            // Введення даних
            System.out.print("input x: ");
            double x = sc.nextDouble();
            System.out.print("input b: ");
            double b = sc.nextDouble();
            
            // Оголошення змінних
            double r, t, h_t;
            
            // Діапазон для t
            double t_min = -10 * x;
            double t_max = 10 * x;
            h_t = b / x; // крок h_t
            
            // Визначення MAX і MIN
            double maxR = Double.NEGATIVE_INFINITY;
            double minR = Double.POSITIVE_INFINITY;
            double maxT = 0, minT = 0;
            
            // Обчислення значень у циклі
            for (t = t_min; t <= t_max; t += h_t) {
                r = 0.14 * Math.pow(t, 2) + Math.pow(b, 5) * x;
                
                System.out.println("t=" + t + " r=" + r);
                
                if (r > maxR) {
                    maxR = r;
                    maxT = t;
                }
                
                if (r < minR) {
                    minR = r;
                    minT = t;
                }
            }
            
            // Виведення результатів
            System.out.println("MAX R = " + maxR + " при t = " + maxT);
            System.out.println("MIN R = " + minR + " при t = " + minT);

        }
    }
}