package Gun26._05_Soru;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudur adı, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.


        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="ali veli";
        System.out.println(ogr.okulNo +" "+ ogr.tamAd );

        Okul mudur=new Okul();
        mudur.mudurAdi="kemal";
        mudur.ucreti=100;






    }
}
