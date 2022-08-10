package Ödevler;

import java.util.Scanner;

public class _220516_Odev {
    public static void main(String[] args) {


//# 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
//        Not: 0 ve 100 dahildir.


//        for(int i=0; i<=100; i++) System.out.println("i = " + i);

//4- 0 - 100 arasındaki sayılardan hem 4 e hem de
//        5 tam bölünebilen sayıları ekrana yazdırınız

        for (int i=0; i<=100;i++){

            if (i%4==0 && i%5==0)
                System.out.println("i = " + i);
        }







    }

}
