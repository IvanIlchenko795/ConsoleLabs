// Головний клас, який використовує всі 3 завдання
import java.util.Scanner;
import task1.IntegerNumber1;
import task2.IntegerNumber2;
import task2.Fraction;
import task3.AbstractOperation;
import task3.Addition;
import task3.Subtraction;

public class Main {
    static Scanner scanner = new Scanner(System.in); // один Scanner для всіх методів

    public static void main(String[] args) {
        System.out.println("Завдання 1");
        task1();

        System.out.println("\nЗавдання 2");
        task2();

        System.out.println("\nЗавдання 3");
        task3();

        scanner.close();
    }

    // Завдання 1 — цілі числа
    public static void task1() {
        System.out.print("Введiть перше цiле число: ");
        int a = scanner.nextInt();
        System.out.print("Введiть друге цiле число: ");
        int b = scanner.nextInt();

        IntegerNumber1 num1 = new IntegerNumber1(a);
        IntegerNumber1 num2 = new IntegerNumber1(b);

        System.out.println("Сума: " + num1.add(num2));
        System.out.println("Рiзниця: " + num1.subtract(num2));
        System.out.println("Добуток: " + num1.multiply(num2));
        System.out.println("Частка: " + num1.divide(num2));
    }

    // Завдання 2 — цілі + дроби в масиві
    public static void task2() {
    IntegerNumber2[] numbers = new IntegerNumber2[4];

    System.out.println("Введіть 4 числа: або ціле (наприклад 5), або дріб (наприклад 1/2)");

    for (int i = 0; i < 4; i++) {
        System.out.print("Введіть число #" + (i + 1) + " (ціле або дріб): ");
        String input = scanner.next();

        if (input.contains("/")) {
            String[] parts = input.split("/");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            numbers[i] = new Fraction(numerator, denominator);
        } else {
            int value = Integer.parseInt(input);
            numbers[i] = new IntegerNumber2(value);
        }
    }

    System.out.println("\nВиведення елементів масиву:");
    for (IntegerNumber2 num : numbers) {
        System.out.println(num); // один оператор
    }

    System.out.println("\nСкладання сусідніх елементів:");
    for (int i = 0; i < numbers.length - 1; i++) {
        IntegerNumber2 a = numbers[i];
        IntegerNumber2 b = numbers[i + 1];

        System.out.print("Сума " + a + " + " + b + " = ");

        if (a instanceof Fraction && b instanceof Fraction) {
            System.out.println(((Fraction) a).add((Fraction) b));
        } else if (a instanceof Fraction) {
            System.out.println(((Fraction) a).addFraction(b));
        } else if (b instanceof Fraction) {
            System.out.println(((Fraction) b).addFraction(a));
        } else {
            System.out.println(a.add(b));
        }
    }
}

    // Завдання 3 — абстрактні операції
    public static void task3() {
        System.out.print("Введiть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введiть друге число: ");
        int b = scanner.nextInt();

        AbstractOperation add = new Addition(a, b);
        AbstractOperation sub = new Subtraction(a, b);

        System.out.println(add.getDescription() + " => Результат: " + add.calculate());
        System.out.println(sub.getDescription() + " => Результат: " + sub.calculate());
    }
}