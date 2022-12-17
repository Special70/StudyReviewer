import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class FileGenerator {
    public static void main(String[] args) {
        int x = 0;
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            try (PrintWriter writer = new PrintWriter("filename.txt", StandardCharsets.UTF_8)) {
                writer.println("");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}