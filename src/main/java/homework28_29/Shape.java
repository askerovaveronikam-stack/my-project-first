package homework28_29;

public abstract class Shape {

    // Метод для обчислення площі (можна залишити або зробити абстрактним)
    public double calculateArea() {
        System.out.println("Площа для базової фігури не визначена.");
        return 0;
    }

    // Абстрактний метод для обчислення периметру
    public abstract double calculatePerimeter();

    // Метод для виведення інформації
    public void displayInfo() {
        System.out.println("Це абстрактна фігура.");
    }
}


