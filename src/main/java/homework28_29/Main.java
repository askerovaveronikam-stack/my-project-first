package homework28_29;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape square = new Square(6);

        circle.displayInfo();
        System.out.println();

        rectangle.displayInfo();
        System.out.println();

        square.displayInfo();
    }
}

