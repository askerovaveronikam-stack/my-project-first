package homework28_29;


import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

public class ShapePerimeterTest {

    @Test
    public void testCirclePerimeter() {
        // given
        Shape circle = new Circle(5);

        // when
        double perimeter = circle.calculatePerimeter();

        // then
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, perimeter, 0.0001);
    }

    @Test
    public void testRectanglePerimeter() {
        // given
        Shape rectangle = new Rectangle(4, 7);

        // when
        double perimeter = rectangle.calculatePerimeter();

        // then
        double expected = 2 * (4 + 7);
        assertEquals(expected, perimeter, 0.0001);
    }

    @Test
    public void testSquarePerimeter() {
        // given
        Shape square = new Square(6);

        // when
        double perimeter = square.calculatePerimeter();

        // then
        double expected = 4 * 6;
        assertEquals(expected, perimeter, 0.0001);
    }
}

