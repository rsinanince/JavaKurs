package Gun43;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz : ");
        int sayi1= oku.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        int sayi2= oku.nextInt();

        System.out.println("bolum = " + (sayi1/sayi2));  //aslında çalışır ama
                                // aşağıdaki gibi 0 a bölmek istersek hata veriyor

//        1.Sayıyı giriniz : 4
//        2.Sayıyı giriniz : 0
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Gun43._02_JavaRunTimeException.main(_02_JavaRunTimeException.java:18)


        // Exception Handling : hata yönetimi


    }
}
