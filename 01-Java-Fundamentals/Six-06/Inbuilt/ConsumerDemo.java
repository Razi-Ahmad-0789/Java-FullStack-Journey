package Six.Inbuilt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//      Consumer<String> consumer1=(str)-> System.out.println(str);
        Consumer<String>consumer1= System.out::println;
        Consumer<String>consumer2=str-> System.out.println("Length:"+str.length());
        consumer1.accept("hello");
        consumer1.accept("hello");
        consumer2.accept("Hello");
        consumer2.accept("Hi");
        List<Integer> number= Arrays.asList(1, 2, 3, 4);
        Consumer<Integer>mutiplyByTwo=n-> System.out.println(n*2);
        System.out.println(mutiplyByTwo);
        number.forEach(mutiplyByTwo);

    }
}
