package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

//        Kullanıcıdan gireceği sayı çift ise bir stringe "çift" atayınız.
//        tek ise "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi= oku.nextInt();

        //klasik yöntem
        if (sayi%2 ==1)
            System.out.println("tek");
        else
            System.out.println("çift");

        //tek satırda yazma yöntemi : Ternary
        String sonuc=(sayi%2==1) ? "Tek" : "Çift";
        //şart doğru ise ilk bölüm, değil ise ikinci bölüm çalışır.

        System.out.println ( ((sayi%2 == 1) ? "Tek" : "Çift"));  //en kısa yazılışı budur.



    }
}
