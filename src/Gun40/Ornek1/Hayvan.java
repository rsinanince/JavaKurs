package Gun40.Ornek1;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecek();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int sayac=0;  //güvenli id istediği için yapıyoruz. sadece bu class a ait. nesneye göre değişmeyecek.

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = ++sayac;   //güvenli id yi buradan alacak.
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

//    public int getId() {                  yukarıda sayac tanımladık, Id için
//        return id;                        get ve set e gerek kalmadı. ayrıca en başta id yi
//    }                                     final olarak tanımladık.
//
//    public void setId(int id) {
//        this.id = ++sayac;
//    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği : "); yiyecek();
        System.out.print("yemek miktarı : "); yemekMiktari();
        System.out.print("günlük uyku süresi : "); gunlukUykuSuresi();
        System.out.print("sesi : "); sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
