package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {

        //istenen noktadaki karakteri verir.
        //karakterin sırası 0 (sıfır) dan başlar. buna index denir.
                    // 0123456789012
        String kelime="Merhaba Dünya";

        System.out.println("3.Harf(indexe göre) = " + kelime.charAt(3));

        char ilkharf=kelime.charAt(0);
        System.out.println("ilkharf = " + ilkharf);




    }
}
