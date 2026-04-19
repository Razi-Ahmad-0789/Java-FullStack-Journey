package Three.Constructor;

public class Dog {
    String name;
    String color;
    String attributes;
    int feet;

    public Dog(String name,String color,String attributes,int feet){
       this.name=name;
       this.feet=feet;
       this.color=color;
       this.attributes=attributes;
    }
    public void activity(){
        System.out.println("Dog name is:"+name+" his color is :"+color+" his attributes is:"+attributes+" he has "+feet+" feet");
    }
}
