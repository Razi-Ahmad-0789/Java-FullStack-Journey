package Six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodInterfaceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Charlie","Bob");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        //Using enhanced for
        for(String name:names){
            System.out.println(name);
        }
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });

        //Modified->1
//            names.forEach((String name)->{
//                System.out.println(name);
//            });

        //Modified->2
//        names.forEach((String name)->{
//            System.out.println(name);
//        });


        //Modified->3
//        names.forEach((name)-> System.out.println(name));

        names.forEach(System.out::println);
     }
}
