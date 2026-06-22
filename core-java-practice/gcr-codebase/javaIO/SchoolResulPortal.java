import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SchoolResulPortal {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("core-java-practice/gcr-codebase/javaIO/students.txt"));
            FileWriter fw = new FileWriter("core-java-practice/gcr-codebase/javaIO/report.txt", true);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);
                double avg = (m1 + m2 + m3) / 3.0;
                fw.write("Name: " + name + "\n");
                fw.write("Marks: " + m1 + "," + m2 + "," + m3 + "\n");
                fw.write("Average: " + avg + "\n");
                fw.write("-------------------------------------\n");
            }
            br.close();
            fw.close();
            System.out.println("Report completed");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exisit");
        }
        catch (IOException e) {
            System.out.println("Error while reading and writing file");
        }
    }
}
