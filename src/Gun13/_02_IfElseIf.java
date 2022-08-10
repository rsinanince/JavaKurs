package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı 1 : ");
        int sayi1= oku.nextInt();

        System.out.print("Sayı 2 : ");
        int sayi2= oku.nextInt();

        System.out.println("Toplama T\n Çıkartma Ç\n Çarpma P\n Bölme B\n giriniz");
        Scanner okuStr = new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam= =" + (sayi1+sayi2));
        else 
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma= = " + (sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("çarpma= = " + (sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println("bölme= = " + (sayi1/sayi2));
                    else
                        System.out.println("Hatalı Seçim");







    }
}
