package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {

        //Maps -> HashMap, LinkedHashSet, TreeSet

        //Sets -> HashSet, LinkedHashSet, TreeSet

        //Key ve Value  .. value yu almak için key kullanılır

                //Key    //Value
        Map<Integer, Integer> m=new HashMap<>();    //Map ailesinden HashMap
                                                    //Key ve Value u INTEGER olan bir Map

        //eleman atama:
        m.put(2,11);   //2 Key ine 11 değeri atandı
        m.put(3,12);
        m.put(6,15);
        m.put(2,5);   //2 anahtarındaki değeri günceller. çünkü aynı eleman iki kez olmaz. son yazılan aynı eleman gelen günceller.

        System.out.println("m = " + m);                     //m = {2=5, 3=12, 6=15}
        System.out.println("m.ge = " + m.get(2));           //2 anahtarındaki değeri çağırır   m.ge = 5
        System.out.println("m.keyset = " + m.keySet());     //m.keyset = [2, 3, 6]   anahtarları verir
        System.out.println("m.values = " + m.values());     //m.values = [5, 12, 15]  değerleri verir

        //foreach ile yazdırma:

        for(Integer k : m.keySet())                 //        k = 2
            System.out.println("k = " + k);         //        k = 3
                                                    //        k = 6

        for(Integer v : m.values())                 //        v = 5
            System.out.println("v = " + v);         //        v = 12
                                                    //        v = 15


        //ikisini birlikte (key ve value) nasıl yazdırabiliriz? ForEach ile.
        for(Map.Entry<Integer, Integer> anahtarValue : m.entrySet())
        {
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }

        System.out.println("m.containsKey(2) = " + m.containsKey(2));  //m.containsKey(2) = true
        System.out.println("m.containsValue(12) = " + m.containsValue(12));   //m.containsValue(12) = true

        m.remove(2);  //2 anahtarındaki herşey silinir
        System.out.println("m = " + m);   //m = {3=12, 6=15}

        System.out.println("m.size() = " + m.size());    //m.size() = 2  (hem key hem value nun değeri aynı olur)

        m.clear();
        System.out.println("m = " + m);    //m = {}





    }
}
