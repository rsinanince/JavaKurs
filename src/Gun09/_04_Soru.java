package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        //girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
        //mesela 524 -> 425

        Scanner oku=new Scanner(System.in);
        System.out.println("3 Basamaklı Bir Sayı Giriniz:");
        int girilenSayi= oku.nextInt();

        int yuzler= (girilenSayi/100)%10;
        int onlar= (girilenSayi/10)%10;
        int birler =girilenSayi%10;

        int tersi= birler*100+onlar*10+yuzler;

        System.out.println("tersi= " + tersi);



    }
}
