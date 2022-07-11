
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0, sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0)
                break;
            else if (num < 0)
                continue;
            else {
                sum += num;
                counter++;
            }
        }

        if (sum == 0)
            System.out.println("Cannot calculate the average");
        else
            System.out.println((1.0 * sum) / counter);
    }
}
