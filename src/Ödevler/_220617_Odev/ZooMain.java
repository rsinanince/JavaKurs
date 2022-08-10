package Ödevler._220617_Odev;
import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {

        IAnimal cat=new Cat();
        IAnimal shark=new Shark();
        IAnimal swallow=new Swallow();
        IAnimal duck=new Duck();

        ArrayList<IAnimal>animals=new ArrayList<>();
        animals.add(cat);
        animals.add(shark);
        animals.add(swallow);
        animals.add(duck);

        for (IAnimal a : animals) {

        if (a instanceof Cat) {System.out.println("Cat " + ((Cat) a).food());            }
        if (a instanceof Shark) {System.out.println("Shark " + ((Shark) a).food());}
        if (a instanceof Swallow) {System.out.println("Swallow " + ((Swallow) a).food());}
        if (a instanceof Duck) {System.out.println("Duck " + ((Duck) a).food());}
        }
    }
}
