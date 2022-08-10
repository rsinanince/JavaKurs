package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün sınıfı bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli class lar için ayrı dosya açınız

        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();  //girilen bilgileri tutmak için

        for (int i=1; i<=4; i++){
            Ogrenci ogr=new Ogrenci();
            System.out.print("okul no = ");
            ogr.okulNo = okuInt.nextInt();
            System.out.print("Tam Ad = ");
            ogr.tamAd = oku.nextLine();
            System.out.print("not = ");
            ogr.not = okuInt.nextInt();

            snf.add(ogr);    //her okunan eklenecek
        }

        bilgiYazdir(snf);     //metod oluşturuyoruz
        ortalamaYaz(snf);

    }

    public static void bilgiYazdir(ArrayList<Ogrenci>snf) {

        for (Ogrenci ogr : snf)
            System.out.println(ogr.okulNo + " " + ogr.tamAd + " " + ogr.not);
    }

    public static void ortalamaYaz(ArrayList<Ogrenci>snf) {

        int toplam=0;
        for (Ogrenci ogr : snf)
            toplam=toplam+ ogr.not;
            System.out.println("ortalama=" + (toplam / snf.size()));
    }

    }





