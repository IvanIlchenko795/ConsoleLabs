import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyCostCalculator {

    public static void main(String[] args) throws IOException {
        // Створення об'єкта BufferedReader для введення даних
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Введення даних для шоколадних цукерок
        System.out.println("Введіть кількість кг шоколадних цукерок (X):");
        double chocolateWeight = Double.parseDouble(reader.readLine());

        System.out.println("Введіть загальну ціну шоколадних цукерок (A):");
        double chocolateTotalCost = Double.parseDouble(reader.readLine());

        // Введення даних для ірисок
        System.out.println("Введіть кількість кг ірисок (Y):");
        double toffeeWeight = Double.parseDouble(reader.readLine());

        System.out.println("Введіть загальну ціну ірисок (B):");
        double toffeeTotalCost = Double.parseDouble(reader.readLine());

        // Розрахунок ціни за 1 кг шоколадних цукерок
        double chocolateCostPerKg = chocolateTotalCost / chocolateWeight;

        // Розрахунок ціни за 1 кг ірисок
        double toffeeCostPerKg = toffeeTotalCost / toffeeWeight;

        // Визначення, у скільки разів дорожчі шоколадні цукерки за іриски
        double priceDifference = chocolateCostPerKg / toffeeCostPerKg;

        // Виведення результатів
        System.out.printf("Ціна за 1 кг шоколадних цукерок: %.2f грн%n", chocolateCostPerKg);
        System.out.printf("Ціна за 1 кг ірисок: %.2f грн%n", toffeeCostPerKg);
        System.out.printf("Шоколадні цукерки дорожчі за іриски у %.2f рази%n", priceDifference);
    }
}