package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız

        Scanner oku=new Scanner(System.in); // okuyucuyu bir kere tanımlamanız gerekiyor.

        System.out.print("Adınızı ve Soyadınızı Yazınız:"); //ekrana gelen veri girişinin ne için olduğunu
        //kullanıcıya belirtmek için zorunlu değil. LN yi sildik çünkü imleç yanda kalsın istedik.

        String AdSoyad= oku.nextLine(); // okuma işi bu noktada yapılıyor. biz de okunan değeri değişkene eşitliyoruz.

        System.out.println("AdSoyad = " + AdSoyad); //okunan değer doğru mu okundu diye ekrana yazdırıyoruz.





    }
}
