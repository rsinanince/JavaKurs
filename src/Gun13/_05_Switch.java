package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {

//        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
//        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
//        // harflerini alarak isteğe uygun olan işlemi yaptırıp
//        // sonucu yazdırınız.(switch kullanınız)

        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayıyı giriniz : ");
        int sayi1= oku.nextInt();

        System.out.print("2.sayıyı giriniz : ");
        int sayi2= oku.nextInt();

        System.out.println("Toplam için T\nÇıkartma için Ç\nÇarpma için P\nBölme için B\n ye basınız." );
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next(); // String tipinde okundu

        switch (islem.toUpperCase()) {
            case "T": System.out.println("toplam=" + (sayi1+sayi2));break;
            case "Ç": System.out.println("çıkartma=" + (sayi1-sayi2));break;
            case "P": System.out.println("çarma=" + (sayi1*sayi2));break;
            case "B": System.out.println("bölme=" + (sayi1/sayi2));break;
            default: System.out.println("Hatalı Giriş");break;
            }
        }




    }

