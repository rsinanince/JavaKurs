package Gun38.Soru1;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Fuel Range 1000km";
    }

    @Override
    public String drive() {
        return "Slow down in city center";
    }
}
