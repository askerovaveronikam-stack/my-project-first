package homework20.car;

import java.time.LocalDate;


public class Car {
    private double fuelLevel;        // літри пального в баку
    private double fuelConsumption;  // витрата палива на 100 км
    private LocalDate nextInspection; // дата наступного техогляду

    // Конструктор
    public Car(double fuelLevel, double fuelConsumption, LocalDate nextInspection) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.nextInspection = nextInspection;
    }

    // Геттери та сеттери
    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LocalDate getNextInspection() {
        return nextInspection;
    }

    public void setNextInspection(LocalDate nextInspection) {
        this.nextInspection = nextInspection;
    }

    //  Методи

    // Машина може їхати
    public boolean canDrive() {
        return fuelLevel > 0;
    }

    // Машина допущена до експлуатації
    public boolean isAllowedToDrive() {
        LocalDate today = LocalDate.now();
        return !today.isAfter(nextInspection); // якщо сьогодні ≤ дата техогляду
    }

    // Скільки км може проїхати
    public double getPossibleDistance() {
        if (fuelConsumption <= 0) return 0;
        return (fuelLevel / fuelConsumption) * 100; // формула
    }

    // Інформація про авто
    @Override
    public String toString() {
        return "Автомобіль {" +
                "паливо = " + fuelLevel + " л, " +
                "витрата = " + fuelConsumption + " л/100км, " +
                "наступний техогляд = " + nextInspection +
                '}';
    }
}
