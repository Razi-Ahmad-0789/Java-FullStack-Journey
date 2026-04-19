package Three.Encapsulation;
class Car{
    private String name;
    private String color;
    private String brand;
    int speed;

    public Car(String brand,String color,String name,int speed){
        this.brand=brand;
        this.color=color;
        this.name=name;
        this.speed=speed;
    }

    public void drive(){
        System.out.println("The car is drive on "+speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        if(speed<0){
            speed=0;
        }
        this.speed=speed;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car=new Car("Tata","Blue_Sky", "Audi", 87);
        car.setSpeed(-200);
        car.drive();

        Car car2 = new Car("Kia", "White", "frari", 82);
        car2.drive();

    }
}
