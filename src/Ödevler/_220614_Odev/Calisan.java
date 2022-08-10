package Ödevler._220614_Odev;

public class Calisan {
    private String isim;
    private String adres;
    private Okul okul;
    private int maas;
    private UyeTipi tipi;

    public Calisan(String isim, String adres, Okul okul, int maas, UyeTipi tipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setMaas(maas);
        setTipi(tipi);
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public Okul getOkul() {
        return okul;
    }
    public void setOkul(Okul okul) {
        this.okul = okul;
    }
    public int getMaas() {
        return maas;
    }
    public void setMaas(int maas) {
        this.maas = maas;
    }
    public UyeTipi getTipi() {
        return tipi;
    }
    public void setTipi(UyeTipi tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul=" + okul +
                ", maas=" + maas +
                ", tipi=" + tipi +
                '}';
    }
}
