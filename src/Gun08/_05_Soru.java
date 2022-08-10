package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

//        girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print(" Kelime Giriniz = ");
        String text= oku.next();
        System.out.println("ilk harf = " + text.charAt(0));

        char ilkHarf= text.charAt(0);
        char sonHarf= text.charAt(text.length()-1);

        System.out.println("ilkHarf ve SonHarf = " + ilkHarf+ " "+sonHarf );

    }
}
