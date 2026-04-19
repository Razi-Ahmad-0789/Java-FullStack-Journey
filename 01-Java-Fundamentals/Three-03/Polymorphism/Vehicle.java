package Three.Polymorphism;

public class Vehicle {
    public String color;
    public int speed;
    public String brand;
    public String tyre;


    public Vehicle(String color,int speed,String brand){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }

    public void display(){
        System.out.println("Brand "+brand);
        System.out.println("Color "+color);
        System.out.println("Speed is right now"+speed);
    }
    public void start(){
        System.out.println("Run");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

}
