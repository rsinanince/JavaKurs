package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

//        girilen bir sayının birler ve onlar basamağının eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");

        int sayi= oku.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;

        if (birler==onlar) {System.out.println("Eşit");}
        if (birler!=onlar) {System.out.println("Eşit Değil");}     // != anlamı eşit değilse, farklı ise.



    }
}
