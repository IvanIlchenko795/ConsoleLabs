import java.util.Scanner;

public class TrigCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Запитуємо користувача про значення α
        System.out.print("Enter the value \"alpha\": ");
        double alpha = sc.nextDouble();
        
        // Обчислення першої формули
        double z1 = (Math.sin(2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha)) /
                    (Math.cos(alpha) + 1 - 2 * Math.pow(Math.sin(2 * alpha), 2));
        
        // Обчислення другої формули
        double z2 = 2 * Math.sin(alpha);
        
        // Виведення результатів
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        
        sc.close();
    }
}