package Gun34._03_Ornek;

public class GenelMudur extends Calisan{



    double tazminat=100;


    public GenelMudur(String isim, int maas, int maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }

    @Override
    public double maashesapla() {
        return super.maashesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                '}' + super.toString();
    }
}
