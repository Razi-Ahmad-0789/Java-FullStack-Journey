package Four;

import java.util.ArrayList;
import java.util.List;

    class Car{
        String brand ;
        Car(String brand){
            this.brand=brand;
        }
    }
public class ListDemo {
    public static void main(String[] args) {
        List<String> users=new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
//        users.add(1);
        users.add("Alice");

        System.out.println("All users");
        for(Object user:users){
            System.out.println(user);
        }
        System.out.println("Element using index:"+users.get(2));

        //List of Objects
        Car car1=new Car("Toyota");
        Car car2=new Car("Friar");
        List<Car>CarList=new ArrayList<>();
        CarList.add(car1);
        CarList.add(car2);
        for(Car car:CarList){
            System.out.println(car.brand);
        }
    }
}
