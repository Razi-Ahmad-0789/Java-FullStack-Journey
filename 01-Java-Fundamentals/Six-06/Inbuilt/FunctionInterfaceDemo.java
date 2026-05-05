package Six.Inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static Function<Integer,Integer>addFunction=(a)->a+3;
    public static Function<Integer,Integer>subFunction=(b)->b-5;
    public static Function<Integer,Integer>combinedFunction=
            addFunction.andThen(subFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(subFunction.apply(6));
        System.out.println(combinedFunction.apply(8));

    }
}
