package Gun24;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);    //addAll ve RemoveAll aynı zamanda ARRAYLIST lerde de geçerlidir.
        birlesikHali.addAll(setB);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        System.out.println("birlesikHali = " + birlesikHali);  //1,2,3,4,5,6,7

        HashSet<Integer> farki=new HashSet<>();   //farkını alıyoruz
        farki.addAll(setA);
        farki.removeAll(setB);

        System.out.println("farkı = " + farki);  //1, 2, 3

        HashSet<Integer> ortakElemanlar=new HashSet<>();   //burada aynı elemanları yazdırdır
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);   //4, 5



    }
}
