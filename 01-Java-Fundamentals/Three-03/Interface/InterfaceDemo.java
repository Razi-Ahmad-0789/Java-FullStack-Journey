package Three.Interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
//        ElectricCar e1=new ElectricCar();
//        e1.applyBreaks();
//        e1.turnLeft();
        CarControls myCar=new ElectricCar();
        myCar.accelerate();

        CarControls myCar2=new SportsCar();
        myCar2.turnLeft();
        myCar2.accelerate();
    }
}
