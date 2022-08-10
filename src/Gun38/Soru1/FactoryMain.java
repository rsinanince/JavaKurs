package Gun38.Soru1;

import java.util.ArrayList;

public class FactoryMain {
    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar("Model 5", 310.0);
        ToyotaPrius prius = new ToyotaPrius("Prius", 1200.0);
        Bus bus = new Bus("Mercedes", 7000.0);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(tesla);
        vehicles.add(prius);
        vehicles.add(bus);

        for (Vehicle v : vehicles) {
            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());


            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            if (v instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius) v).drive());
                System.out.println(((ToyotaPrius) v).changeBattery());
                System.out.println(((ToyotaPrius) v).changeOil());
            }
            if (v instanceof Bus) {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDiesel());
            }


        }
    }
}