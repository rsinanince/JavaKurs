package Gun12;

import java.util.Random;
import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {

//      girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.
//      kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Kaça Kadar Sayı Tutulsun : ");
        int kacaKadarRandomSayi= oku.nextInt();

        int tutulanSayi= (int)(Math.random() * kacaKadarRandomSayi);

        System.out.println("Tahmininiz : ");
        int tahmin= oku.nextInt();

        // 1. Yöntem
        if(tutulanSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki bilemedin ki");

        //2.Yöntem

        System.out.println( ((tutulanSayi == tahmin) ? " Tebrikler" : "bilemedinki bilemedinki"));

        System.out.println("tutulanSayi = " + tutulanSayi);




    }
}
