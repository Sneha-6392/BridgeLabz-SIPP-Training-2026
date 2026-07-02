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
public class LBWildcards {
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog());
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        addDogs(animals);
        addDogs(objects);
    }
}