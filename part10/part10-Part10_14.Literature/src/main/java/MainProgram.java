import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops");
            String name = scanner.nextLine();
            if (name.equals(""))
                break;

            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
        }

        System.out.println(books.size() + " books in total.\n");

        // sort books by age rec, if same age rec then sort by name
        Comparator<Book> comparator = Comparator
            .comparingInt(Book::getAge)
            .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for (Book book: books)
            System.out.println(book);
    }

}
