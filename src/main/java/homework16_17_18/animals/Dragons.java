package homework16_17_18.animals;

public class Dragons {
    private String name;
    private int age;
    private double weight;

    public Dragons() {
        System.out.println("Створено невідомого дракона");
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

    // Метод "говорити"
    public void voice() {
        System.out.println(name + " каже: Грррррррррррррррррррр!");
    }

    public void voice(String word) {
        System.out.println(name + " каже: " + word);
    }

    //  Новий метод — випускати вогонь
    public void fire() {
        System.out.println(name + " випускає полум’я!!! 🔥");
    }

    //  Метод toString()
    @Override
    public String toString() {
        return "Дракон {" +
                "ім'я='" + name + '\'' +
                ", вік=" + age +
                ", вага=" + weight +
                '}';
    }
}
