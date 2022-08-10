package Gun22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {




        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar ilk hali = " + rakamlar);

        //Sıralama işlemleri
        Collections.sort(rakamlar);   //küçükten büyüğe sıralar
        System.out.println("rakamlar.sort = " + rakamlar);

        Collections.reverse(rakamlar);   //tersine çevirri
        System.out.println("rakamlar.reverse = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar, 0);  //bütün elemanlara verilen değeri atar.
        System.out.println("rakamlar.fill = " + rakamlar);

        Collections.replaceAll(rakamlar, 0, 2);  //0 ları 2 ile değiştirir
        System.out.println("rakamlar.replaceAll = " + rakamlar);



    }
}
