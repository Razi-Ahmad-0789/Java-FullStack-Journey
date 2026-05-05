package Six.Inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
       Predicate<Integer>isEven=n->n%2==0;
        System.out.println(isEven.test(8));
        System.out.println(isEven.test(11));

        BiPredicate<Integer,Integer>isSumEven=(a,b)->(a+b)%2==0;
        System.out.println(isSumEven.test(2,5));
        System.out.println(isSumEven.test(4,4));

    }
}
