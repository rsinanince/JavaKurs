package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");  //eklenmedi
        renkler.add("RED");  //eklendi

        //ekrana yazdırma 1.yöntem
        System.out.println("renkler" + renkler);   //renkler[Red, RED, Blue, Green]

        //ekrana tek tek yazdırma 2.yöntem

        for(String s : renkler ){      //renklerin içindeki elemanları herhangi bir sıra ile s ismini vererek gönderiyor
            System.out.println("renkler = " + s);           //genelde foreach kullanılır.
        }

//        renkler = Red
//        renkler = RED
//        renkler = Blue
//        renkler = Green


        // TreeSet ve LinkedSet olanlar for ile yazdırılırken sıralı yazılmayabilir.
        // Bunların sıralı yazılmasını sağlamak için Iterator kullanılır. çok yaygın değil.

        TreeSet<String> ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");

        Iterator gosterge= ths.iterator();
        while (gosterge.hasNext())
        {
            System.out.println("gosterge.next() = " + gosterge.next());   //sıralı elemanı gösterir.index in yaptığının aynısıdır.
        }
//        gosterge.next() = beş
//        gosterge.next() = bir
//        gosterge.next() = dört
//        gosterge.next() = iki
//        gosterge.next() = üç







    }
}
