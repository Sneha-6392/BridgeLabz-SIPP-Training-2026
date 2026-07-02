public class Overloading {
    public static <T> void print(T value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        print(10);
        print("Hello");
        print(99.5);
        print(true);
    }
}