package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {

        // Girilen bir string deki nokta sayısını bulunuz
        //01.02.20 bu string de kaç tane nokta vardır

        Scanner oku=new Scanner(System.in);
        System.out.print("Bilgiyi Giriniz = ");
        String girilen= oku.nextLine();

        int uzunluk1=girilen.length();
        String noktasız = girilen.replace(".", "");
        System.out.println("noktasız = " + noktasız);
        int uzunluk2=noktasız.length();

        System.out.println("nokta sayısı = " + (uzunluk1-uzunluk2));

        //noktaları çıkarttık. noktalı ile noktasız arasındaki uzunluk farkını bulduk.

    }
}
