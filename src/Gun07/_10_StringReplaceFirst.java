package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {

        // ReplaceFirst : Replace ile aynı, sadece ilk bulunanı değiştirir.

        String text="Merhaba Dünya";
        System.out.println("orijinal hali = " + text);
        System.out.println("bütün a ları değiştirelim = " + text.replace("a", "_"));
        System.out.println("sadece ilk a yı değiştirelim = " + text.replaceFirst("a", "_"));

    }
}
