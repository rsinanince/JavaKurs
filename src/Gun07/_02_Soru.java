package Gun07;

import java.util.Scanner;

public class _02_Soru {

    public static void main(String[] args) {

        //girilen bir ad soyadı adını ve soyadını ayırıp ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız Soyadınız:");
        String AdSoyad= oku.nextLine();

        //sinan ince boşluğunun indexini bulup substringle alabiliriz.
        int boslukIndex=AdSoyad.indexOf(" ");
        String ad=AdSoyad.substring(0,boslukIndex);
        String soyad=AdSoyad.substring(boslukIndex+1);

        System.out.println("ad = " +ad);
        System.out.println("soyad = " + soyad);


    }
}
