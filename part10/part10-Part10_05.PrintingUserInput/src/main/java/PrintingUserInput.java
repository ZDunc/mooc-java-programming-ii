
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String str = scanner.nextLine();
            if (str.equals(""))
                break;

            strings.add(str);
        }

        strings.stream()
            .forEach(value -> System.out.println(value));
    }
}
