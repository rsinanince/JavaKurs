package Gun11;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {

//        Mantıksal (Logic) İfadeler
//        && -> ve      || -> veya

//        girilen sayı pozitif ve tek ise ekrana uygun sayı girildi
//        değilse uygun sayı girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();

        if (sayi > 0 && sayi%2==1) {System.out.println("uygun sayı girildi");}
        else {System.out.println("uygun sayı girilmedi");}


    }
}
