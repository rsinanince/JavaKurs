package Gun36.Soru;

public class Ogrenci extends Kisi{

    public Ogrenci(String ad, String soyad, String gorev) {
        super(ad, soyad, gorev);
    }
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorev, String subesi) {
        super(ad, soyad, gorev);
        this.subesi = subesi;
    }
    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                '}';
    }
    public void subesi(){
        System.out.println("5A");
    }
}
