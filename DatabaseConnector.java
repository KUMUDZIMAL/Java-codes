import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatabaseConnector {
    public static void main(String[] args) {
        String fileName = "Database.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line of the file here
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("This is the error");
        }
    }
}