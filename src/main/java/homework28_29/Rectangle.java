package homework28_29;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: Прямокутник");
        System.out.println("Ширина: " + width);
        System.out.println("Висота: " + height);
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}
