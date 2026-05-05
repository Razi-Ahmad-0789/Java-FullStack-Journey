package Six.Inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        //<title>costs $<price>
        BiFunction<String,Double,String>formatter=(title,price)->title+" costs:"+price;
        System.out.println(formatter.apply("JavaBasics",1000.00));
        System.out.println(formatter.apply("Python Basics:",199.50));
        System.out.println(formatter.apply("C++ Basics",500.00));

        System.out.println();

        BiConsumer<String,Double> formatterConsumer=(title, price)-> System.out.println(title+" Costs$ "+price);
        formatterConsumer.accept("Python Basics",100.0);
        formatterConsumer.accept("Java Basics",150.0);
        formatterConsumer.accept("C++ Basics",100.0);


        //isExpensive
        Predicate<Double> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(900.3));
    }
}
