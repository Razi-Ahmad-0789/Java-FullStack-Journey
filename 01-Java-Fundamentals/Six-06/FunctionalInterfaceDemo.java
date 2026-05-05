package Six;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
 interface BookAction{
     void perform();
 }
 //Parameter->expression body
//()->{}

//Functional Interface with Parameters
@FunctionalInterface
interface Operation{
    int add(int a,int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //STEP->1
        BookAction action=new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");
            }
        };
       // action.perform();
        //STEP->2
        BookAction action1=()->{
            System.out.println("Action Performed");
        };
//        action1.perform();

        //STEP->3
        BookAction action2=()->
            System.out.println("Action Performed");
        //action2.perform();


        Operation operation1=new Operation() {
            @Override
            public int add(int a, int b) {
                System.out.println(a+b);
                return 0;
            }
        };
        operation1.add(5,6);

        Operation operation2=(int a,int b)->{
            return a+b;
        };
        System.out.println(operation2.add(2,3));

        //THREAD INTERFACE
        new Thread(()-> System.out.println("New Thread Created")).start();
    }
}
