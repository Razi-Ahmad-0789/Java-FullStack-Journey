package Five;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
//         int a=10;
//         int result=a/9;
        System.out.println("Done");

        try {
            //EXCEPTION GENERATING STATEMENTS
             int result=10/0;
        } catch (Exception e) {
            //EXCEPTION HANDLING STATEMENTS
            System.out.println("In Catch Block");
        }


        int[]arr={1,2,3};
        try {
            System.out.println(arr[9]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception");
        }catch (ArithmeticException e){

        } finally {
            //ALWAYS EXECUTES
            System.out.println("FINALLY");
        }
        System.out.println("Outside Try Catch");

        try {
            FileReader fileReader = new FileReader("abc.txt");
        }catch (FileNotFoundException e){
//            throw new RuntimeException(e);
        }
    }
}
