import java.util.Scanner;

public class Calculating8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення розміру масиву
        System.out.print("Enter the array size: ");
        int num = sc.nextInt();
        int[] Arr = new int[num];

        // Заповнення масиву випадковими значеннями (-10 до 10)
        for (int i = 0; i < num; i++) {
            Arr[i] = (int) (Math.random() * 21) - 10;
        }

        // Виведення масиву
        System.out.print("Massif: ");
        for (int i = 0; i < num; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();

        // Перевірка умов завдання
        int first = Arr[0];
        int last = Arr[num - 1];
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (Arr[i] != first && Arr[i] != last) {
                count++;
            }
        }

        // Виведення результату
        System.out.println("Number of elements other than the first and last: " + count);

        sc.close();
    }
}