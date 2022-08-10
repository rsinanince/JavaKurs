package Gun15;

import java.util.Scanner;

public class _09_GununSorusu {
    public static void main(String[] args) {

//        0-255 e kadar olan harflerin sayı ve harf değerini ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        for (int i=0; i<=255; i++){

            char harf=(char) i;
            System.out.println(i + " - " + harf);
        }


    }
}
