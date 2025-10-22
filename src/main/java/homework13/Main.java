package homework13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Веддіть розмір вашого масиву: ");
        int arrayLength = sc.nextInt();
        int [] arr  = new int[arrayLength];
        System.out.println("Введіть по черзі дані вашого масиву");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }
        int choice;


        do {
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Ваш вибір: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Сума елементів = " + sum);
                    break;

                case 2:
                    int total = 0;
                    for (int num : arr) {
                        total += num;
                    }
                    double average = (double) total / arr.length;
                    System.out.println("Середнє арифметичне = " + average);
                    break;

                case 3:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Найбільший елемент = " + max);
                    break;

                case 4:
                    System.out.println("Програму завершено.");
                    break;

                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }

        } while (choice != 4);

        sc.close();
    }
}
