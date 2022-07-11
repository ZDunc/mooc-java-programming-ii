
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            // reading the file line by line
            Files.lines(Paths.get("literacy.csv"))
            // splitting the row into parts on the "," character
            .map(row -> row.split(","))
            // sort
            .sorted((a, b) -> {
                Double difference = Double.valueOf(a[5]) - Double.valueOf(b[5]);
                return (int) (difference * 10000);
            })
            // mapping to desired string format
            .map(parts -> parts[3] + " (" + parts[4] + ")," + parts[2].substring(0, parts[2].indexOf("le") + 2) + ", " + parts[5])
            // and print each new string*/
            .forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
