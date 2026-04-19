package Three.Polymorphism;

public class Bike extends Vehicle {
    int tyre;

    public Bike(String brand,String color,int tyre,int speed){
        super(color,speed,brand);
        this.tyre=tyre;
    }
    public void print(){
        System.out.println("The Bike Brand name is:"+brand);
        System.out.println("The Bike Color is :"+color);
        System.out.println("The number of tyre is:"+tyre);
        System.out.println("The Bike speed is :"+speed);
    }
    @Override
    public void start(){
        System.out.println("Run");
    }
}
