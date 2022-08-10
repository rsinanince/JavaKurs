package Ödevler._220614_Odev;

public class Okul {

    private String okulAdi;
    private int maxOgrSayisi;
    private Ogrenci ogrenci;
    private Calisan calisan;

    public Okul(String okulAdi, int maxOgrSayisi, Ogrenci ogrenci, Calisan calisan) {
        setOkulAdi(okulAdi);
        setMaxOgrSayisi(maxOgrSayisi);
        setOgrenci(ogrenci);
        setCalisan(calisan);
    }
    public String getOkulAdi() {
        return okulAdi;
    }
    public void setOkulAdi(String okulAdi) {this.okulAdi = okulAdi;}
    public int getMaxOgrSayisi() {
        return maxOgrSayisi;
    }
    public void setMaxOgrSayisi(int maxOgrSayisi) {
        this.maxOgrSayisi = maxOgrSayisi;
    }
    public Ogrenci getOgrenci() {
        return ogrenci;
    }
    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    public Calisan getCalisan() {
        return calisan;
    }
    public void setCalisan(Calisan calisan) {
        this.calisan = calisan;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdi='" + okulAdi + '\'' +
                ", maxOgrSayisi=" + maxOgrSayisi +
                ", ogrenci=" + ogrenci +
                ", calisan=" + calisan +
                '}';
    }
}
