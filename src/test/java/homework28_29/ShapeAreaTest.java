package homework28_29;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeAreaTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        double expected = Math.PI * 25; // π * r^2
        assertEquals(expected, circle.calculateArea(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rect = new Rectangle(4, 7);
        double expected = 28;
        assertEquals(expected, rect.calculateArea(), 0.0001);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(6);
        double expected = 36;
        assertEquals(expected, square.calculateArea(), 0.0001);
    }

    @Test
    public void testShapeBaseArea() {
        Shape shape = new Shape() {
            @Override
            public double calculatePerimeter() {
                return 0;
            }
        };
        double expected = 0;
        assertEquals(expected, shape.calculateArea(), 0.0001);
    }
}

