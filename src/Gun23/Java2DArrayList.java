package Gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2DArrayList {
    public static void main(String[] args) {

        /*********************************/
        int sayi = 5;                     // tek bir eleman(sayı/harf/vb) saklayabilen değişken
        int[] dizi = new int[20];        //20 adet eleman saklayabilen değişken
        int[][] tablo = new int[4][20];    //20x4 tane eleman saklayabilen değişken

        ArrayList<Integer> liste = new ArrayList<>();  //istenildiği kadar rakam eklenebilen değişken

        //3 öğrencinin mat, fizik, kimya notlarını tek bir yerde birleştireceğiz.

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); //2 boyutlu ArrayList. listelerin listesi.
        // her bir elemanı ArrayList'tir.

        ArrayList<Integer> mathNotlar = new ArrayList<>();
        mathNotlar.add(60);
        mathNotlar.add(70);
        mathNotlar.add(80);
        mathNotlar.add(90);

        ArrayList<Integer> fizikNotlar = new ArrayList<>();
        fizikNotlar.add(65);
        fizikNotlar.add(85);

        ArrayList<Integer> kimyaNotlar = new ArrayList<>();
        kimyaNotlar.add(68);
        kimyaNotlar.add(78);
        kimyaNotlar.add(88);

        notlarListesi.add(mathNotlar);
        notlarListesi.add(fizikNotlar);
        notlarListesi.add(kimyaNotlar);

        notlarListesi.get(0);   //0. listeyi gösterir. bu tanımın her bir elemanı listedir.
        notlarListesi.get(0).get(0);  //0. listenin 0.elemanını verir.

        System.out.println("notlarListesi = " + notlarListesi.get(0)); //0.listeyi yazdırır
        System.out.println("notlarListesi = " + notlarListesi.get(1)); //1.listeyi yazdırır
        System.out.println("notlarListesi = " + notlarListesi.get(2)); //2.listeyi yazdırır

        //yukarıdakileri kısaca yazmak için aşağıdaki döngü kullanılır
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        //tüm notları tek tek yazdırmak:
        for (int i = 0; i < notlarListesi.size(); i++) {   //liste uzunluğu, yani yaprak sayısı


            //derslerin baş tarafı burası olduğu için ders isimlerini buraya getiriyoruz.
            System.out.println(dersler.get(i)); //ders isimlerini yazdık

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  //her bir listedeki notların sayısı
                System.out.print((i + 1) + ".yaprak, " + (j + 1) + ".not=");
                System.out.println(notlarListesi.get(i).get(j));   //satır sutun yapısı tablo[i][j]
            }
        }

        //soru-1 kullanıcıdan alınan ders no suna göre ekrana Notların Listesini bir fonksiyonda yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("dersNo (0-Mat, 1-Tur, 2-Kim) :");
        int dersNo = oku.nextInt();

        dersNotlariYazdir(notlarListesi, dersNo, dersler);  //gönderme kısmı. fonksiyon kısmı burası. ÖNEMLİ!!

        //Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.

        int ort = dersOrtalamaBul(notlarListesi, dersNo);
        System.out.println("ort = " + ort);

//      Soru 3 : Tüm derslerin not ortalamasını (double) bir fonksiyonda buldurup mainde yazdırınız.


//      Soru 4 : En büyük ve en küçük notu bir main içinde bulunuz (fonksiyon yok).

    }
            public static int dersOrtalamaBul(ArrayList< ArrayList<Integer>> notlarListesi, int dersNo){

                int toplam=0;
                for(int i=0; i<notlarListesi.get(dersNo).size(); i++)
                    toplam=toplam + notlarListesi.get(dersNo).get(i);

                return toplam/notlarListesi.get(dersNo).size();
        }


    public static void dersNotlariYazdir(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo, ArrayList<String> dersler) {  //alma kısmı.

        System.out.println(dersler.get(dersNo));  //dersin adı yazıldı

        for (int i=0; i< notlarListesi.get(dersNo).size(); i++)
            System.out.println(notlarListesi.get(dersNo).get(i));

    }


}