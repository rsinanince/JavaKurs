package Ödevler;

import java.util.Scanner;

public class _220510_Odev {

    public static void main(String[] args) {

//        1- Girilen 3 sayıdan büyük olanı yazdırınız

//        Scanner oku=new Scanner(System.in);
//        System.out.println("3 Sayı Giriniz : ");
//        int sayi1= oku.nextInt();
//        int sayi2= oku.nextInt();
//        int sayi3= oku.nextInt();
//        int enb=sayi1;
//
//        if (sayi2>enb) {enb=sayi2;}
//        if (sayi3>enb) {enb=sayi3;}
//
//        System.out.println("enb = " + enb);

//        2-Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup olmadığını kontrol ediniz.

//        Scanner oku=new Scanner(System.in);
//        System.out.print("Sayı Giriniz : ");
//        int sayi= oku.nextInt();
//        int birler= sayi%10;
//        System.out.println("birler = " + birler);
//        int onlar= sayi/10%10;
//        System.out.println("onlar = " + onlar);
//
//        if (birler/2!=0 && onlar/2!=0 && birler==onlar) {System.out.println("Doğru");}
//        else System.out.println("Yanlış");

//        3-Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kelime Yazınız : ");
        String kelime= oku.nextLine();
        if (kelime.contains(" ") || kelime.contains("A")) {System.out.println("Boşluk veya A harfi var");}
        else System.out.println("Yok");




    }

}
