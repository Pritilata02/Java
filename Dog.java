import java.net.Socket;
public class Dog {
    
    int eyes=2;
    int legs=4;
    int nose=1;
    int ears=2;
    int mouth=1;
    int tail=1;
    String name;

    boolean canRun()
    {
        return true;
    }
    boolean canBark()
    {
        return true;
    }
    boolean canSwim(String name)
    {
        if(name=="Pixi")
            return true;
        return false;

    }
    void run()
    {
        System.out.println("Running....");
    }
    void bark()
    {
        System.out.println("Barking....");
    }
    void swim()
    {
        System.out.println("Swiming....");
    }
    void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Eyes: "+eyes);
        System.out.println("Legs: "+legs);
        System.out.println("Nose: "+nose);
        System.out.println("Ears: "+ears);
        System.out.println("Mouth: "+mouth);
        System.out.println("Tail: "+tail);
        if(canSwim(name))
            swim();
        if(canRun())
            run();
        if(canBark())
            bark();
        System.out.println("..............................");
    }
    public static void main(String[] args)
    {
        Dog pixi, cookie, rayn;

        pixi=new Dog();
        pixi.name="Pixi";
        pixi.legs=3;

        cookie=new Dog();
        cookie.name="Cookie";
        cookie.tail=0;

        rayn=new Dog();
        rayn.name="Rayn";
        rayn.eyes=1;
        

        pixi.getDetails();
        cookie.getDetails();
        rayn.getDetails();

    }
}
    
