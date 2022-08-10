package Gun31.StaticModifier.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAdi="Yıldırım Ortaokulu";
    //hepsi için geçerli tek bir tane eleman olduğunda böyle kullanırız.
    //tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", OkulAd='" + okulAdi + '\'' +
                '}';
    }
}

