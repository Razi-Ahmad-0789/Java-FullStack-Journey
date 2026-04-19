package Two;

public class ControlFlow {
    public static void main(String[] args) {
        // if & else
        int age = 20;
        if(age>=18){
            System.out.println("Welcome in our bank");
        }
        else{
            System.out.println("Try again when your age is 18");
        }


        // else-if Ladder
        int marks = 80;
        if(marks>90) {
            System.out.println("Grade A");
        }else if(marks>80){
            System.out.println("Grade B");
        }else if(marks>70){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade F");
        }


        // switch
        String day = "Monday";
        switch (day){
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            default -> System.out.println("Invalid day");
        }

        // LOOP

        // FOR

//        for (int i = 0; i < 10; i++) {
//            System.out.println("count:"+i);
//        }


        // While

//        int num = 7;
//        while(num>0){
//            System.out.println("Num: " + num);
//            num--;
//        }

        // do-While

//        int num = 5;
//        do{
//            System.out.println("Number:"+num);
//            num--;
//        }while (num>0);


        // Enhanced  for each

//        String[] fruits = {"Apple","Orange","Pear","Strawberry"};
//        for(String a : fruits){
//            System.out.println("Fruits:"+a);
//        }

        //  break  &   continue

//        for (int i = 0; i < 10; i++) {
//            if(i==2) continue;
//            if(i==5) break;
//            System.out.println(i);
//        }
    }
}
