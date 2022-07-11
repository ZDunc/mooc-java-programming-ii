
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            String str = scanner.nextLine();
            int num = Integer.valueOf(str);
            if (num < 0)
                break;

            numList.add(num);
        }

        numList.stream()
            .filter(num -> num > 0 && num < 6)
            .forEach(num -> System.out.println(num));
    }
}
