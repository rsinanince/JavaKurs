package Ödevler._220617_Odev;

public class Duck implements IFlying, ISailing, IAnimal {
    public Duck() {
    }
    @Override
    public String food() {
        return "Eats worms";
    }
}
