package homework28_29;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * width;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: Квадрат");
        System.out.println("Сторона: " + width);
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }

}
