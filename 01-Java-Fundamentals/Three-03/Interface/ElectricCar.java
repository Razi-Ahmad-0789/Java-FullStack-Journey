package Three.Interfaces;

public class ElectricCar implements CarControls{

    @Override
    public void turnRight() {
        System.out.println("ELECTRIC RIGHT");
    }
    @Override
    public void turnLeft() {
        System.out.println("ELECTRIC LEFT");

    }
    @Override
    public void applyBreaks() {
        System.out.println("ELECTRIC BREAKS");
    }
    @Override
    public void accelerate(){
        System.out.println("ELECTRIC ACCELERATE");
    }
}
