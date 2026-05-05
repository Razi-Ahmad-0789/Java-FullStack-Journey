package Six.Inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>addConsumer=(a,b)-> System.out.printf("Addition of two numbers:"+(a+b));
        addConsumer.accept(10,20);
    }
}
