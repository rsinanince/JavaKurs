package Gun12;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {

//      girilen sayı 50 den büyük ise 1, değilse 0 değerini yazdırınız.
//      ternary operator ile yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi= oku.nextInt();

        //1.yontem
        int sonuc= (sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);

        //2.yöntem
        System.out.println( "sonuc : " + ((sayi>50) ? "1" : "0") );






    }
}
