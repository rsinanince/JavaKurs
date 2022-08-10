package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

//        kullanıcının gireceği 2 sayının birbirine eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz = ");
        int sayi1= oku.nextInt();
        System.out.print("İkinci Sayıyı Giriniz = ");
        int sayi2= oku.nextInt();
        System.out.println("Sayılar eşit mi? = " + (sayi1==sayi2));

    }
}
