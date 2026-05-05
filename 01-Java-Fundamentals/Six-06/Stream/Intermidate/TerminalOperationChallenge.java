package Six.Streams;

import Six.Streams.Intermediate.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationChallenge {
    public static void main(String[] args) {
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
        //Total cost of all books in the bookstore
        Double bookCost=books.stream()
                .mapToDouble(book->book.price)
                .reduce(0,Double::sum);
        System.out.println(bookCost);
        //Collecting books into a list of titles
        List<String> bookTitle = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(bookTitle);

        //Grouping books by category

        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);
        });
    }
    static Function<Book,String>bookStringFunction=new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
