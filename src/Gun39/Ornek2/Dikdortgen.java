package Gun39.Ornek2;

public class Dikdortgen extends Sekil{

    private double kisaKenar;   //bu metodlar dikdortgen ve daire için farklı olduğu için her birinin kendi içinde bu formülleri tanımlıyoruz.
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    double alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    double cevre() {
        return (kisaKenar+uzunKenar)*2;
    }
}
