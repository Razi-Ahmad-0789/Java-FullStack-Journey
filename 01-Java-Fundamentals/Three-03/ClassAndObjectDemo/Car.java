package Three.ClassesAndObjectsDemo;

public class Car {
    String color;
    String brand;
    int speed;
    String name;
     private int price;

     public void setPrice(int price){
         this.price=price;
     }
    public  int getPrice(){

        return price;
    }
    public void drive(){
        System.out.println(name+" is driving on the "+speed);
    }
}
