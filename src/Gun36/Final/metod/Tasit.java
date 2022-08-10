package Gun36.Final.metod;

public class Tasit {

    private String model;

    public Tasit(String model) {
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {   //buraya final i sonradan yazdık. direk kullanabilir ama değiştiremez.
        return "Tasit{" +             //extend ile burayı miras alacak class burayı override edememesi için.
                "model='" + model + '\'' +
                '}';
    }
}
