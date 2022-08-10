package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {

        // Verilen karakter(lerin) string içindeki index ini verir.
        // Merhaba kelimesindeki r nin indexini bulmak istersek kelime.IndexOf("r") ->2 verir.
        // Merhaba kelimesindeki ha nın indexini bulmak için kelime.IndexOf("ha") ->3 verir.ilk karakterinkini verir.
        // Merhaba kelimesindeki a nın indexini bulmak için kelime.IndexOf("a") ->4  verir.ilk gördüğü karakteri verir.
        // eğer bulamazsa -1 gönderir, bulunamadı anlamındadır.


        String kelime="Merhaba Dünya";

        System.out.println("kelime.indexOf(r) = " +kelime.indexOf("r"));
        System.out.println("kelime.indexOf(ha) = " +kelime.indexOf("ha"));
        System.out.println("kelime.indexOf(a) = " +kelime.indexOf("a"));
        System.out.println("kelime.indexOf(ny) = " +kelime.indexOf("ny"));
        System.out.println("kelime.indexOf( ) = " +kelime.indexOf(" "));
        System.out.println("kelime.indexOf(A) = " +kelime.indexOf("A"));

        System.out.println("kelime.indexOf(a) = " + kelime.indexOf("a", 5)); //4 ten sonraki a ları bul.


    }
}
