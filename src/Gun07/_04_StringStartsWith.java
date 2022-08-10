package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {

//        StartsWith : bir stringin verilen string ile başlayıp başlamadığının sonucunu boolean olarak döner.

        String text="HCL Teknoloji";

        System.out.println("HE ile başlıyor mu = " + text.startsWith("HC"));
        System.out.println("Me ile başlıyor mu = " + text.startsWith("Me"));
        System.out.println("M ile başlıyor mu = " + text.startsWith("M"));
        System.out.println("h ile başlıyor mu = " + text.startsWith("h"));
        System.out.println("hc ile başlıyor mu = " + text.startsWith("hc"));






    }
}
