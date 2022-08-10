package Gun10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

//      girilen bir sayının tek mi çift mi olduğunu yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi= oku.nextInt();

        if (sayi<0){sayi=sayi*-1;} //girilecek tüm sayıları pozitife çevirmiş olduk. bu olmasaydı negatif sayılar çalışmaz.

        if (sayi%2==0){
            System.out.println("Sayı Çift");}
        if (sayi%2==1){
            System.out.println("Sayı Tek");}





    }
}
