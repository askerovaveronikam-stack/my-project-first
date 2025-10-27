package homework16.animals;

public class Dragons {
    private String name;
    private int age;
    private double weight;

    public Dragons() {
        System.out.println("Створено невідомго дракона");
    }

    public Dragons(String name, int age, double weight) {
        System.out.println("Створено повноцінного дракона");

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

}
