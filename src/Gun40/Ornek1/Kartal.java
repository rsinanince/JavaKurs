package Gun40.Ornek1;

public class Kartal extends Hayvan{

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecek() {
        System.out.println("et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1 kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyakk");
    }
}
