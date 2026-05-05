package Six.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[]args) {
        List<String>items= Arrays.asList("Apple","Banana","Cherry");
        for(String fruit:items)
            System.out.println(fruit);

        //Using Streams
        Stream<String> stream=items.stream();
        stream.forEach(System.out::println);

        System.out.println("== Filtered Fruit==");
        Stream<String>streamNew=items.stream();
        Stream<String> filterdStream
                = streamNew.filter(name -> name.startsWith("C"));
                filterdStream.forEach(System.out::println);

        items.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);


        /*
         * USE CASES:
         * 1. Filtering
         * 2. Mapping
         * 3. Aggregation
         * 4. Searching
         * 5. Iteration
         *
         *
         * */
     }
}
