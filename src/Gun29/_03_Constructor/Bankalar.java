package Gun29._03_Constructor;

public class Bankalar {

    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.

    public static void main(String[] args) {

        Banka bnk1=new Banka("Garanti", 45, 1980);
        Banka bnk2=new Banka("Ziraat", 15, 1900);
        Banka bnk3=new Banka();
        bnk3.adi="İş";
        bnk3.subeSayisi=62;
        bnk3.kurulusYili=1923;

        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);

    }

}
