package Gun36.Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;
    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);}
    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
    public String getSoyad() {return soyad;}
    public void setSoyad(String soyad) {this.soyad = soyad;}
    public String getGorev() {return gorev;}
    public void setGorev(String gorev) {this.gorev = gorev;}
    public void kimlikYaz()
    {
        System.out.println("Adı : "+ad);
        System.out.println("Soyadı : "+soyad);
        System.out.println("Görevi : "+gorev);
    }
}
