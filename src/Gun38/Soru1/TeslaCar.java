package Gun38.Soru1;

public class TeslaCar extends Vehicle implements IElectric{

    public TeslaCar(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Change the Battery";
    }

    @Override
    public String drive() {
        return "Auto Pilot Available";
    }
}
