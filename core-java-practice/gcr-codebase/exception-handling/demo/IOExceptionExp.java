import java.io.*;

public class IOExceptionExp {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
