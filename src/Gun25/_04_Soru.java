package Gun25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {

//        Canlı Sözlük yapılmak isteniyor
//        Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
//        1- Ekleme (kelimenin kendisi ve anlamını bir cümle ile yazınız)
//        2- Düzeltme (kelimeyi düzelttiriniz, yeniden yazdırınız)
//        3- Listeleme
//        4- Arama (verilen bir kelimeyle başlayan tüm kelimelerin anlamları)
//        5- Silme
//        6- Çıkış


        Map<String, String> sozluk=new TreeMap<>();

        Scanner okuInt=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        String kelime="";
        String anlami="";
        String arama="";
        String silKelime="";
        int secim=0;
        do {
            System.out.println("******* Menu *******");
            System.out.println("1 - Ekleme");
            System.out.println("2 - Düzeltme");
            System.out.println("3 - Listeleme");
            System.out.println("4 - Arama");
            System.out.println("5 - Silme");
            System.out.println("6 - Çıkış");
            System.out.print("Seçiniz : "); secim = okuInt.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Kelimeyi giriniz : ");//ekleme işlemleri
                    kelime= oku.nextLine();
                    System.out.print("Anlamını giriniz : ");
                    anlami= oku.nextLine();
                    sozluk.put(kelime,anlami);
                    break;

                case 2:
                    //TODO: kelime var mı yok mu kontrolü yapılacak
                    System.out.print("Düzeltilecek kelimeyi giriniz : ");//düzeltme işlemleri
                    kelime= oku.nextLine();
                    if (sozluk.containsKey(kelime)){
                    System.out.print("Anlamını giriniz : ");
                    anlami= oku.nextLine();
                    sozluk.put(kelime, anlami);}
                    else {System.out.println("hatalı giriş");}
                    break;

                case 3: //listeleme işlemleri
                    System.out.println("sozluk = " + sozluk);
                    break;

                case 4: //arama işlemleri : kelimenin bir kaç harfini girdiğinde en yakın kelimeyi bulsun
                    System.out.print("Kelime Yazınız : "); arama=oku.nextLine();
                    if (arama.contains("a")){System.out.println("araba");}
                    if (arama.contains("b")){System.out.println("bulut");}
                    if (arama.contains("c")){System.out.println("coşku");}
                        else{
                        System.out.println("Bulunamadı");}
                    break;

                case 5: //silme işlemleri
                    System.out.print("Silinecek Kelimeyi Giriniz : ");
                    silKelime=oku.nextLine();
                    sozluk.remove(silKelime);
                break;
            }
        }while (secim<6);

        System.out.println();
        System.out.println("Sözlük : \n" + sozluk);

//TODO : bütün işlemler burada yapıldıktan sonra, METOD ile bütün işlemleri ayırınız.











    }
}
