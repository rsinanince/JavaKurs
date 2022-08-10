package Gun38.Soru1;

public class ToyotaPrius extends Vehicle implements IElectric, IGas{

    public ToyotaPrius(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Battery Lifetime Ending";
    }

    @Override
    public String changeOil() {
        return "Change Oil in 100km";
    }

    @Override
    public String drive() {
        return "Electric Mod Active For 10km";
    }
}
