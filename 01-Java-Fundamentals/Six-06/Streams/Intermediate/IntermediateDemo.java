package Six.Streams.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
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
        //1.Filtering :Books cheaper than $20
//        Stream<Book>stream1=books.stream();
//        Stream<Book>stream2=stream1.filter(predicate);
//        stream2.forEach(System.out::println);
          Stream<Book>filterBooks=books.stream().filter(book -> book.price<20);
                  filterBooks.forEach(System.out::println);
        //2.Mapping:Convert book titles to uppercase
        Stream<String>upperCaseTitles=books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);


        //3.Sorting:Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);
        //4.Distance :Remove duplicate titles
        Stream<Book>uniqueBooks=books.stream().distinct();
        uniqueBooks.forEach(System.out::println);
        //5.Limit:Display only the first 3 books
        Stream<Book>firstThreeBooks=books.stream()
                .limit(3);
        firstThreeBooks.forEach(System.out::println);
        //6.Skip:Skip the frist 2 books
        Stream<Book>afterSkippingTwo=books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);

    }
    static Predicate<Book>predicate=new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price<20;

        }
    };
}
