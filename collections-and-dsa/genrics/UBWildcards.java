import java.util.*;
class Animal {
    public void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat Meows");
    }
}
public class UBWildcards {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        printAnimals(dogs);
        printAnimals(cats);
    }
}