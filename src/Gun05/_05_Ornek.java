package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("birinci sayı:");
        int Sayi1= oku.nextInt();

        System.out.print("ikinci sayı:");
        int Sayi2= oku.nextInt();

        //1.yöntem
        int toplam=Sayi1+Sayi2;
        System.out.println ("toplam=" + toplam);

        //2.yöntem
        System.out.println("toplam = " + (Sayi1+Sayi2));

        //string toplama olan durum
        System.out.println("toplam = " + Sayi1+Sayi2); //rakamları yan yana topladı çünkü
        //toplama işleminde bir string var ise diğerleri otomatik string olur.




    }
}
