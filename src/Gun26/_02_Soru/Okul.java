package Gun26._02_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

// Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.

        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);   //ikinci scanner yazmamızın sebebi sınıf a int değer girilecek olmasıdır.

        for(int i=1; i<=3; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.print("Öğrenci Adı: ");
            ogr.adi= oku.nextLine();

            System.out.print("Öğrenci Soyadı: ");
            ogr.soyadi = oku.nextLine();

            System.out.print("Öğrenci Sınıfı: ");
            ogr.sinifi = okuInt.nextInt();

            System.out.print("Öğrenci Adresi: ");
            ogr.adres = oku.nextLine();

            snf.add(ogr);
        }

        for ( Ogrenci ogr : snf )                      //foreach ile yazdırabiliyoruz. sadece sout ile yazdırılmıyor.
        {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sınıfı = " + ogr.sinifi);
            System.out.println("ogr.adresi = " + ogr.adres);
        }

    }
}

class Ogrenci{

    String adi;
    String soyadi;
    int sinifi;
    String adres;

}