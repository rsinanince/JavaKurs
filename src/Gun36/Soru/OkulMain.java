package Gun36.Soru;

public class OkulMain {
    public static void main(String[] args) {

        Calisan calisan1=new Calisan("Ali", "Yıldız", "Muhasebeci");
        Ogrenci ogrenci1=new Ogrenci("Ayşe", "Demir", "Sınıf Başkanı");

        kimlikForm(calisan1);
        calisan1.departman();

        System.out.println();

        kimlikForm(ogrenci1);
        ogrenci1.subesi();
    }
    public static void kimlikForm(Kisi kisi)
    {  kisi.kimlikYaz();  }
}

