package Gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5;                 //hafızada 1 sayı tutar
        int[] dizi=new int[5];      //hafızada 5 rakam tutuyor.
        int[][] tablo=new int[3][4];   //12 adet sayı tutuyor.

        //dinamik boyutlu diziler gerektiğinde
        ArrayList<Integer>liste=new ArrayList<>(); //boyu eklendikçe artan dinamik dizi
        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>();  //dinamik 2 boyutlu dizi

        //SET ler:
        //1 elemandan sadece 1 tane tutan diziler. öncekiler elemanları rastgele, birden çok kere tutan dizilerdi
        //sırasının önemi yok.
        //bunlara SET denir. LINKEDHASHSET(eklenme sırasına göre), TREESET(ordered/sıralı), HASHSET(hızlı)

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi=hs1.add(5);               //aynı elemanın ikincisini eklemez.aşağıda denedik.
        System.out.println("ikinci 5 eklendi mi?" + eklendiMi);

        System.out.println("hs1" + hs1);






    }

}
