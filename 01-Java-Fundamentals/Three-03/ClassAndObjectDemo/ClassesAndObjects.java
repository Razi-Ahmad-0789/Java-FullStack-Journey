package Three.ClassesAndObjectsDemo;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.color="Red";
        car1.speed=79;
        car1.brand="Audi";
        car1.name="hark";
        car1.setPrice(89);
        System.out.println(car1.getPrice());
        car1.drive();

        Car car2=new Car();
        car2.color="Blue";
        car2.speed=89;
        car2.name="listen";
    }
}
