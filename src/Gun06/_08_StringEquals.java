package Gun06;

public class _08_StringEquals {
    public static void main(String[] args) {

        //2 string in birbirine eşit olup olmadığını kontrol eder.
        //sonuç boolean döner.

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMİ=s1.equals(s2);
        System.out.println("esitMİ = " + esitMİ); //s1 s2 ye eşit Mİ

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); //s1 s2 ye eşit mi diye sorar.
        System.out.println("s1.equals(MERHABA) = " + s2.equals("MERHABA")); //s2"MERHABA" ya eşit mi diye sorar.

    }
}
