package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {

//        trim: stringin başındaki veya sonundaki boşluk karakterlerini temizler.

        String text="   Merhaba Dünya  ";

        System.out.println("text in orijinal hali= ->" + text +"<-");
        System.out.println("text in trimlenmiş hali= ->"+ text.trim() +"<-");

    }
}
