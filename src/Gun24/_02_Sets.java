package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

//      SETS :
//      HashSet (hızlı çalışır),
//      LinkedHashSet (ekleme sırasına göre sıralı tutar),
//      TreeSet (her zaman sıralı tutar)

        //HashSet
        // Hızlı çalışmak için kendi özel algoritma sırasına göre saklar

        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs" + hs);   //hs[dört, iki, bir, üç, beş]   sırasız yazar

        //LinkedSet
        //Eklenme sırasına göre elemanlarını tutar

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lsh" + lhs);  //lsh[bir, iki, üç, dört, beş]   eklenme sırasına göre yazdı

        //TreeSet
        //Alfabetik/sayısal olarak sıralı tutar

        TreeSet<String> ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths" + ths);   //ths[beş, bir, dört, iki, üç]    alfabetik sıraya göre yazdı


        TreeSet<Integer> ths2=new TreeSet<>();
        ths2.add(5);
        ths2.add(25);
        ths2.add(43);
        ths2.add(19);
        ths2.add(834);
        System.out.println("ths2" + ths2);    //ths2[5, 19, 25, 43, 834]   sayıları da sıralı tutar


    }
}
