package Ödevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _220527_Odev {
    public static <meyveler> void main(String[] args) {

//        1-ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArayList  ve  bir tane String
//        Return tipi int olmalı.
//        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//
//        Örnek;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)

        Scanner oku=new Scanner(System.in);

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("orange");
        meyveler.add("kiwi");
        meyveler.add("peach");
        meyveler.add("banana");
        meyveler.add("orange");
        System.out.println(meyveler);

        System.out.print("Sayılacak Eleman : ");
        String girilen=oku.nextLine();

        System.out.println("Count : " + Collections.frequency(meyveler, girilen.toLowerCase()));

    }

public static int getCount;


}

//  2 -  getSum() isminde bir method oluşturun.
//        Parametresi ArrayList olmalı
//        Return tipi int olmalı.
//        ArrayList teki tüm sayıları birbiri ile toplayın.
//        return olarak toplam sonucu döndürün.
//        Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı




//    public static ArrayList<Integer> getSum(int[] dizi) {
//
//        int toplam;
//
//        for (int i=0; i<dizi.length; i++)
//            do {
//                getSum(dizi)
//            }
//        toplam.add(dizi[i]);
//        return toplam;


