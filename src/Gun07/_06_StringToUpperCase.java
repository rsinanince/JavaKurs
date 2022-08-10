package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {

//      ToUpperCase : stringi büyük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orijinal hali="+ text); //Merhaba Dünya
        System.out.println("text in büyük hali = " + text.toUpperCase()); //MERHABA DÜNYA

        System.out.println("büyük küçük harf farketmeden ya ile bitiyor mu?" +
                text.toUpperCase().endsWith("YA")); //true


    }
}
