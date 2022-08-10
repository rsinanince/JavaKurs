package Gun33._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {


    Kisi kisi1 = new Kisi ();
    kisi1.ad = "Ali";
    kisi1.soyad = "Beyaz";

    kisi1.yasAta(-25);  //yaş gibi rakamlar yanlışlıkla eksi girilse bile artı yazdırabiliyoruz.
    int yas=kisi1.yasGetir();

        System.out.println("kisi1" + kisi1);

        Kisi kisi2=new Kisi("Veli", "Can", -32);
        System.out.println("kisi2 = " + kisi2);










    }
}
