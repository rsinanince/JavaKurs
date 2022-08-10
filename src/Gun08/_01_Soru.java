package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

//        Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştirdiniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Adınızı Giriniz=");
        String Ad= oku.next();

        System.out.println("Soyadınızı Giriniz=");
        String Soyad= oku.next();

        String AdSoyad= Ad.concat (" ").concat(Soyad);
        System.out.println("AdSoyad = " + AdSoyad);







    }
}
