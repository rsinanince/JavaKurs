package Ödevler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _220520_Odev {
    public static void main(String[] args) {

//        1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız. Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayı : ");
        int sayi1= oku.nextInt();
        System.out.print("2.sayı : ");
        int sayi2= oku.nextInt();
        System.out.print("3.sayı : ");
        int sayi3= oku.nextInt();
        System.out.print("4.sayı : ");
        int sayi4= oku.nextInt();

        int[] dizi = {sayi1,sayi2,sayi3,sayi4};
        System.out.print(Arrays.toString(dizi));

        int enB=sayi1;
        if(sayi2>enB) {enB=sayi2;}
        if(sayi3>enB) {enB=sayi3;}
        if(sayi4>enB) {enB=sayi4;}

        int enK=sayi1;
        if(sayi2<enK) {enK=sayi2;}
        if(sayi3<enK) {enK=sayi3;}
        if(sayi4<enK) {enK=sayi4;}
        System.out.println();
        System.out.println("enB - enK =" + (enB-enK));








//        2-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
//        sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.
//        ve Halit Hocanın verdiği sorular.

//        Scanner oku=new Scanner(System.in);
//
//        System.out.print("1.Sayı : ");
//        int sayi1= oku.nextInt();
//        System.out.print("2.Sayı : ");
//        int sayi2= oku.nextInt();
//        System.out.print("3.Sayı : ");
//        int sayi3= oku.nextInt();
//
//        String[][] tablo=new String[2][3];
//
//        for(int i=0; i<1; i++){
//            System.out.print("$"+sayi1 + " " + "$"+sayi2 + " " +"$"+sayi3);
//            System.out.println();
//            for (int j=0; j<1; j++) {
//                System.out.print("$"+sayi3 + " " + "$"+sayi1 + " " +"$"+sayi2);
//                System.out.println();
//            }
//            System.out.println("toplam =");
//            System.out.print("$"+(sayi1+sayi3)+ " " +"$"+(sayi2+sayi1)+ " " +"$"+(sayi3+sayi2));
//        }



    }
}
