package homework16;

import homework16.animals.Dragons;

public class Main {
    static void main() {

        Dragons Toothless = new Dragons();
        Toothless.setName("Toothless");
        Toothless.setAge(4);
        Toothless.setWeight(500);

        System.out.println("Dragons name: " + Toothless.getName());
        System.out.println("Dragons age: " + Toothless.getAge());
        System.out.println("Dragons weight: " + Toothless.getWeight());

        Dragons Stitch = new Dragons("Stitch", 1, 25.5);

        System.out.println("Dragons name: " + Stitch.getName());
        System.out.println("Dragons age: " + Stitch.getAge());
        System.out.println("Dragons weight: " + Stitch.getWeight());

    }
}
