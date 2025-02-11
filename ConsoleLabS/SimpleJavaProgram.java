import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class SimpleJavaProgram {
    public static void main(String[] args) throws IOException {
        // Створення об'єкта BufferedReader для введення даних
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Запит імені користувача
        System.out.print("Введіть ваше ім'я: ");
        String name = reader.readLine();

        // Вітання користувача
        System.out.println("Привіт, " + name + "!");

        // Запит віку
        System.out.print("Скільки вам років? ");
        int age = Integer.parseInt(reader.readLine());

        // Розрахунок року народження
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;

        // Виведення результатів
        System.out.println(name + ", ви народилися у " + birthYear + " році.");
    }
}

