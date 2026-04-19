package Three.Polymorphism;

public class Car extends Vehicle {
    public String backSpace;
    public int tyre;

    public Car(String  color,int speed, String brand,String backSpace,int tyre){
        super(color,speed,brand);
        this.backSpace=backSpace;
        this.tyre=tyre;
    }
    @Override
    public void start(){
        System.out.println("Run");
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.println("The car backSpace is confirm:"+backSpace);
//        System.out.println("The car fuel is full");
//    }

}
