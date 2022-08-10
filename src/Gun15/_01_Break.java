package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

//        Girilen bir sayının 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();

        int sayac=1;
        int arananSayi=0;
        while (sayac<=sayi) {

            if(sayac*sayac == sayi){
                arananSayi=sayac;
                break;
            }

            sayac++;
        }

        if (arananSayi >0) //aranan sayıya bir değer atanmış mı, bunu tespit etmek için yazdık.
            System.out.println("tam karedir, sayi = " + arananSayi);
        else
            System.out.println("Bu sayı tam kare değildir");




    }
}
