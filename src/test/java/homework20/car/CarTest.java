package homework20.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(30.0, 6.0, LocalDate.of(2025, 12, 31));
    }

    @Test
    void testCanDrive_WhenFuelNotEmpty_ShouldReturnTrue() {
        assertTrue(car.canDrive(), "Машина повинна їхати, якщо бак не порожній");
    }

    @Test
    void testCanDrive_WhenFuelEmpty_ShouldReturnFalse() {
        car.setFuelLevel(0);
        assertFalse(car.canDrive(), "Машина не може їхати, якщо бак порожній");
    }

    @Test
    void testIsAllowedToDrive_BeforeInspectionDate_ShouldReturnTrue() {
        assertTrue(car.isAllowedToDrive(), "Машина має бути допущена до експлуатації");
    }

    @Test
    void testIsAllowedToDrive_AfterInspectionDate_ShouldReturnFalse() {
        car.setNextInspection(LocalDate.of(2020, 1, 1));
        assertFalse(car.isAllowedToDrive(), "Машина не допущена, якщо техогляд прострочений");
    }

    @Test
    void testGetPossibleDistance_CalculatesCorrectly() {
        double expected = (30.0 / 6.0) * 100; // формула: (паливо / витрата) * 100
        assertEquals(expected, car.getPossibleDistance(), 0.0001, "Неправильний розрахунок відстані");
    }

    @Test
    void testGetPossibleDistance_WhenConsumptionIsZero_ShouldReturnZero() {
        car.setFuelConsumption(0);
        assertEquals(0, car.getPossibleDistance(), "Якщо витрата 0, має бути 0 км");
    }
}
