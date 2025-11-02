package homework16_17_18.animals;

public class Dragons {
    private String name;
    private int age;
    private double weight;
    private Breed breed;

    public Dragons() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragons(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Створено дракона без породи");
    }

    public Dragons(String name, int age, double weight, Breed breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        System.out.println("Створено повноцінного дракона");
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

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void voice() {
        System.out.println(name + " каже: Грррррррррррррррррррр!");
    }

    public void voice(String word) {
        System.out.println(name + " каже: " + word);
    }

    public void fire() {
        System.out.println(name + " випускає полум’я!!! 🔥");
    }

    @Override
    public String toString() {
        return "Дракон {" +
                "ім'я='" + name + '\'' +
                ", вік=" + age +
                ", вага=" + weight +
                ", порода=" + (breed != null ? breed : "невідома") +
                '}';
    }
}
