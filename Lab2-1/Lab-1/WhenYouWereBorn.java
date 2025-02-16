import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class WhenYouWereBorn {
    public static void main(String[] args) throws IOException {
        // Створення об'єкта BufferedReader для введення даних
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Запит імені користувача
        System.out.print("Enter your name: ");
        String name = reader.readLine();

        // Вітання користувача
        System.out.println("Hello, " + name + "!");

        // Запит віку
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.readLine());

        // Розрахунок року народження
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;

        // Виведення результатів
        System.out.println(name + ", you were born in " + birthYear);
    }
}