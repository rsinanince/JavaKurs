package Gun43;

import java.util.Scanner;

public class _07_ThrowExample2 {
    public static void main(String[] args) {

        // try-catch in farklı bir kullanım yöntemi: burada hata yakalamak için kullanmıyoruz.
        // istediğimiz kriterlere uyulup uyulmadığını kontrol etmek için kullanıyoruz.

        Scanner oku = new Scanner(System.in);

        System.out.println("yeni kullanıcı ve şifre giriniz");

        System.out.print("Kullanıcı : ");
        String userName = oku.nextLine();

        System.out.print("Şifre : ");
        String password = oku.nextLine();

        try {
            if (password.length() < 8)
                throw new Exception("şifre 8 karakterden az olamaz");

            if (password.length() > 15)
                throw new Exception("şifre 15 karakterden fazla olamaz");
        }
        catch (Exception e)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Uyarı : " + e.getMessage());
        }
        // log tutuluyor
        // kimler bu hatalı girişleri yapmış
        //...
        // birçok kontrol tek yerde toplanıyor
    }

        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
        // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
        // break gibi programın devamının çalışmasını engelliyoruz.

}


