package Ödevler._220614_Odev;

public class Ogrenci {
    private String isim;
    private String adres;
    private Okul okul;
    private int ucret;
    private UyeTipi tipi;

    public Ogrenci(String isim, String adres, Okul okul, int ucret, UyeTipi tipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUcret(ucret);
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
    public int getUcret() {
        return ucret;
    }
    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    public UyeTipi getTipi() {
        return tipi;
    }
    public void setTipi(UyeTipi tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul=" + okul +
                ", ucret=" + ucret +
                ", tipi=" + tipi +
                '}';
    }
}

