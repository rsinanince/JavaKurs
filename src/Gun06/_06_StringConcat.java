package Gun06;

public class _06_StringConcat {

    public static void main(String[] args) {
        //Concat bir stringi diğerine ekler.

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birleşik hali="+s1+s2); //iki string in birleşik hali.
        System.out.println("birleşik hali="+s1.concat(s2)); // s1 + s2 ile aynı
        System.out.println("birleşik hali="+s1.concat(" ").concat(s2)); //s1+" "+s2 gibi çalışır.
        System.out.println("birleşik hali="+s1.concat(" "+s2));
    }
}
