package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        //girilen bir stringin sadece son harifini yazdırınız.
        // Merhaba -> length : 7
        // yani length -1 son harfin index ini verir

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string değer giriniz:");
        String girilen=oku.nextLine();

        int uzunluk=girilen.length();
        char sonharf=girilen.charAt(uzunluk-1); //Toplam karakter sayısı okundu.
        //Fakat charAt index e göre çalıştığından 1 eksiği alındı.

        System.out.println("sonharf = " + sonharf);
        System.out.println("sonharf = " + girilen.charAt(girilen.length()-1)); //bu şekilde de yazılabilir.

        System.out.println("uzunluk = " + girilen.length() );




    }
}
