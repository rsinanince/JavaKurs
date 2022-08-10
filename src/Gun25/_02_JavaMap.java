package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        //Bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String, String> sKartvizit=new HashMap<>();
        sKartvizit.put("isim", "Ayşe");
        sKartvizit.put("email","ayşe@gmail.com");
        sKartvizit.put("adres","Türkiye");
        sKartvizit.put("telefon","346833");

        System.out.println("sKartvizit.get(\"isim\") = " + sKartvizit.get("isim"));
        System.out.println("sKartvizit.get(\"telefon\") = " + sKartvizit.get("telefon"));

        Map<String, String> nKartvizit=new HashMap<>();
        nKartvizit.put("isim", "Ali");
        nKartvizit.put("email","ali@gmail.com");
        nKartvizit.put("adres","Almanya");
        nKartvizit.put("telefon","587496");

        Map<String, Map<String, String>> kartDefteri=new HashMap<>();  //Map lerin  Map'i
        kartDefteri.put("Ayşe", sKartvizit);  //Ayşe anahtarına ayşe nin kartviziti atandı
        kartDefteri.put("Ali", nKartvizit);

        System.out.println("Alinin telefonu = " + kartDefteri.get("Ali").get("telefon"));

        for (Map.Entry<String, Map<String, String>> kartVizit: kartDefteri.entrySet())
            System.out.println("kartVizit = " + kartVizit);


    }
}
