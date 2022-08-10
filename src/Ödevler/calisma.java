package Ödevler;

import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {

//        girilen bir sayıya kadar random sayı üreterek tahmi etmeye calisin
//        kullanıcı bilirse tebrikler yazın

        Scanner oku=new Scanner(System.in);
        System.out.print("kaca kadar sayı tutulsun : ");
        int tutulanSayi= oku.nextInt();
        int randomSayi=(int)(Math.random()*tutulanSayi);
        System.out.print("Tahmin : ");
        int tahminSayi= oku.nextInt();
        if (tahminSayi==randomSayi) System.out.println("Bildiniz");
        else System.out.println("Bilemediniz");








    }

}
