package homework20;

import homework20.car.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Створимо автомобіль
        Car car = new Car(25.0, 8.5, LocalDate.of(2026, 5, 15));

        System.out.println(car);

        // 1. Перевірка, чи може їхати
        if (car.canDrive()) {
            System.out.println("✅ Машина може їхати, бак не порожній.");
        } else {
            System.out.println("❌ Машина не може їхати, бак порожній!");
        }

        // 2. Перевірка, чи допущена до експлуатації
        if (car.isAllowedToDrive()) {
            System.out.println("✅ Машина допущена до експлуатації.");
        } else {
            System.out.println("⚠️ Машина НЕ допущена до експлуатації, потрібен техогляд!");
        }

        // 3. Скільки може проїхати
        System.out.printf("🚗 Машина може проїхати приблизно %.1f км.\n", car.getPossibleDistance());
    }
}

