package Gun38.Soru1;

public class Vehicle {

    private String model;
    private Double engine;

    public Vehicle(String model, Double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
