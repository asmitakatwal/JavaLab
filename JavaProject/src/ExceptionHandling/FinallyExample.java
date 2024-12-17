package ExceptionHandling;
import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        } finally {
            System.out.println("This will always execute.");
        }
    }
}

