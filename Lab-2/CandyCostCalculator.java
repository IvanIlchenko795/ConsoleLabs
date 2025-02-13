import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyCostCalculator {
    public static void main(String[] args) throws IOException {
        // Створення об'єкта BufferedReader для введення даних
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Введення даних для шоколадних цукерок
        System.out.println("Enter the amouth of chocolates kg (X):");
        double chocolateWeight = Double.parseDouble(reader.readLine());

        System.out.println("Enter the total prise of the chocolates (A):");
        double chocolateTotalCost = Double.parseDouble(reader.readLine());

        // Введення даних для ірисок
        System.out.println("Enter the amouth of toffee kg (Y):");
        double toffeeWeight = Double.parseDouble(reader.readLine());

        System.out.println("Enter the total prise of the toffee (B):");
        double toffeeTotalCost = Double.parseDouble(reader.readLine());

        // Розрахунок ціни за 1 кг шоколадних цукерок
        double chocolateCostPerKg = chocolateTotalCost / chocolateWeight;

        // Розрахунок ціни за 1 кг ірисок
        double toffeeCostPerKg = toffeeTotalCost / toffeeWeight;

        // Визначення, у скільки разів дорожчі шоколадні цукерки за іриски
        double priceDifference = chocolateCostPerKg / toffeeCostPerKg;

        // Виведення результатів
        System.out.printf("Prise for 1 kg of chocolates: %.2f usd%n", chocolateCostPerKg);
        System.out.printf("Prise for 1 kg of toffee: %.2f usd%n", toffeeCostPerKg);
        System.out.printf("Chocolates are more expensive than toffees in %.2f as%n", priceDifference);
    }
}