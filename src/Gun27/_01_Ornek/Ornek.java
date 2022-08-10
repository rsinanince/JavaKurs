package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1 - Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2 - Adım : main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
        // 3 - Adım : bu değerleri yazdırınız.
        // 4 - Adım : getBirthYear isminde Person a ait bir metod yazınız.
        //             çalıştığında kişinin doğum yılını versin
        // 5 - Adım : getInitials isminde kişinin adının ilk harfi, soyadının ilk harfi
        //            şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


        Person kisi1=new Person();
        kisi1.name="Hatice";
        kisi1.surname="Namlı";
        kisi1.age=20;

        Person kisi2=new Person();
        kisi2.name="Ali";
        kisi2.surname="Beyaz";
        kisi2.age=25;

        //1.yöntem
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        System.out.println();

        //2.yöntem
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();

        //3.yöntem ->yazdırmayı class da public kısmına tanımlıyoruz
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println();//araya boşluk eklemek için
        kisi1.getBirthYear();
        kisi2.getBirthYear();

        System.out.println();
        kisi1.getInitials();
        kisi2.getInitials();

    }
    public static void BilgiYazdir(Person kisi){
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.surname = " + kisi.surname);
        System.out.println("kisi.age = " + kisi.age);


    }
}
