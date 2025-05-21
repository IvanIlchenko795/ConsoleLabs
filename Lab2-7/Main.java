import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення для IntegerNumber1 (Завдання №1)
        System.out.print("Введiть перше цiле число: ");
        int a = sc.nextInt();
        System.out.print("Введiть друге цiле число: ");
        int b = sc.nextInt();
        IntegerNumber1 n1 = new IntegerNumber1(a);
        IntegerNumber1 n2 = new IntegerNumber1(b);
        n1.printOperations(n2);

        // Введення для масиву об'єктів IntegerNumber2 / Fraction (Завдання №2)
        IntegerNumber2[] numbers = new IntegerNumber2[4];
        System.out.println("\nВведiть 4 значення (цiле або дрiб типу 2/3):");

        for (int i = 0; i < 4; i++) {
            System.out.print("Введiть значення #" + (i + 1) + ": ");
            String input = sc.next();
            if (input.contains("/")) {
                String[] parts = input.split("/");
                int num = Integer.parseInt(parts[0]);
                int den = Integer.parseInt(parts[1]);
                numbers[i] = new Fraction(num, den);
            } else {
                int val = Integer.parseInt(input);
                numbers[i] = new IntegerNumber2(val);
            }
        }

        System.out.println("\nЕлементи масиву:");
        for (IntegerNumber2 n : numbers) {
            System.out.println(n);
        }

        System.out.println("\nСума сусiднiх елементiв:");
        for (int i = 0; i < numbers.length - 1; i++) {
            IntegerNumber2 x = numbers[i];
            IntegerNumber2 y = numbers[i + 1];

            System.out.print(x + " + " + y + " = ");
            if (x instanceof Fraction && y instanceof Fraction) {
                System.out.println(((Fraction) x).add((Fraction) y));
            } else if (x instanceof Fraction) {
                System.out.println(((Fraction) x).addFraction(y));
            } else if (y instanceof Fraction) {
                System.out.println(((Fraction) y).addFraction(x));
            } else {
                System.out.println(x.add(y));
            }
        }

        // Введення для контейнерів (Завдання №3)
        System.out.print("\nКiлькiсть цiлих чисел у контейнерi: ");
        int m1 = sc.nextInt();
        Integer[] ints = new Integer[m1];
        for (int i = 0; i < m1; i++) {
            System.out.print("int[" + i + "] = ");
            ints[i] = sc.nextInt();
        }

        System.out.print("\nКiлькiсть дiйсних чисел у контейнерi: ");
        int m2 = sc.nextInt();
        Double[] doubles = new Double[m2];
        for (int i = 0; i < m2; i++) {
            System.out.print("double[" + i + "] = ");
            String input = sc.next().replace(",", "."); // дозволяємо кому

                if (input.contains("/")) {
                String[] parts = input.split("/");
                double num = Double.parseDouble(parts[0]);
                double den = Double.parseDouble(parts[1]);
                doubles[i] = num / den;
            } else {
                doubles[i] = Double.parseDouble(input);
        }
    }

        Container<?>[] containers = new Container[] {
        new IntContainer(ints),
        new DoubleContainer(doubles)
    };

        System.out.println("\nРезультати контейнерiв:");
        for (Container<?> c : containers) {
        System.out.println(c); // toString виведе все: до, після, сума
    }

        sc.close();
    }
}