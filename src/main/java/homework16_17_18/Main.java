package homework16_17_18;

import homework16_17_18.animals.Dragons;
import java.util.Scanner;

public class Main {
    static void main() {

        // 1. Створюємо дракона через конструктор
        Dragons toothless = new Dragons();
        toothless.setName("Toothless");
        toothless.setAge(4);
        toothless.setWeight(500);
        System.out.println(toothless);
        toothless.fire();
        toothless.voice();

        // 2. Створюємо дракона через повний конструктор
        Dragons stitch = new Dragons("Stitch", 1, 25.5);
        System.out.println(stitch);
        stitch.fire();
        stitch.voice("Привіт!");

        // 3. Створення дракона через введення з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я дракона: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік дракона: ");
        int age = scanner.nextInt();

        System.out.print("Введіть вагу дракона: ");
        double weight = scanner.nextDouble();

        Dragons customDragon = new Dragons(name, age, weight);
        System.out.println("Ваш дракон створений!");
        System.out.println(customDragon);

        customDragon.fire();
        customDragon.voice();
    }
}
