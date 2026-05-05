package Six.Streams.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */
        List<Book> books = Arrays.asList(
                new Book("Fiction", 2018, 15.99, "The Silent Garden"),
                new Book("Science", 2020, 22.50, "Cosmic Wonders"),
                new Book("Fiction", 2005, 12.75, "Echoes in the Rain"),
                new Book("Biography", 2022, 18.00, "A Life in Code"),
                new Book("Technology", 2023, 35.90, "Java Stream Mastery"),
                new Book("Fiction", 2017, 14.50, "The Midnight Library"),
                new Book("Science", 2004, 20.15, "Quantum Realm"),
                new Book("Technology", 2006, 20.0, "Advanced Spring Boot"),
                new Book("Biography", 2018, 16.99, "The Innovator's Journey"),
                new Book("Fiction", 1998, 16.98, "Old Man and the Sea")
        );
        //Identify all books that are priced over $20
        System.out.println("Identify all books that are priced over $20");
        books.stream().filter(book -> book.price>20)
                .forEach(System.out::println);

        //Identify and display books that were published before the year 2020.
        System.out.println("Identify and display books that were published before the year 2020");
        books.stream().filter(book -> book.publicationYear<2000)
                .forEach(System.out::println);

        //Add suffix "(Coming Soon)" to all the current titles.
        System.out.println("Add suffix\"(Coming Soon)\" to all the current tiles");
        books.stream().map(book -> book.title+"(Coming Soon)").forEach(System.out::println);

        //Display the books sorted by their prices in ascending order
        System.out.println("Display the books sorted by their prices in ascending order");
        books.stream()
                .sorted(Comparator.comparingDouble(book->book.price))
                .forEach(System.out::println);

        // A rare book is one where the title has more than 20 characters
        System.out.println(" A rare book is one where the title has more than 20 characters");
        books.stream()
                .filter(book -> book.title.length()>20)
                .forEach(System.out::println);
    }
}
