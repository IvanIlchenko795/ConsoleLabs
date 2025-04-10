import java.util.Random;

public class Variant3 {
    public static void main(String[] args) {
        int n = 5; // Кількість рядків
        int m = 5; // Кількість стовпців
        int[][] Z = new int[n][m];
        Random rand = new Random();

        int a = 2, b = 10; // Межі для фільтрації
        int product = 1;
        int sum = 0, count = 0;

        System.out.println("Z array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Z[i][j] = rand.nextInt(21) - 6; // Випадкові числа [-6; 14]
                System.out.print(Z[i][j] + "\t");

                // Середнє арифметичне додатних
                if (Z[i][j] > 0) {
                    sum += Z[i][j];
                    count++;
                }

                // Добуток для парних рядків
                if (i % 2 == 1 && Z[i][j] > a && Z[i][j] < b) {
                    product *= Z[i][j];
                }
            }
            System.out.println();
        }

        // Середнє арифметичне
        double avgPositive = count > 0 ? (double) sum / count : 0;

        // Виведення результатів
        System.out.println("The product of the elements in the even rows (" + a + "; " + b + "): " + product);
        System.out.println("The arithmetic mean of the positive elements: " + avgPositive);
    }
}