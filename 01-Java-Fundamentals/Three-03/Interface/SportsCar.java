package Three.Interfaces;

public class SportsCar implements CarControls{

    @Override
    public void turnRight() {
        System.out.println("SportsCar");

    }

    @Override
    public void turnLeft() {
        System.out.println("Sports LEft");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Apply Breaks");
    }

    @Override
    public void accelerate() {
        System.out.println("Apply Accelerate on Sports Car");
    }
}
