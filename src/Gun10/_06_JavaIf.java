package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

//        girilen 3 sayıdan en büyük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz :");
        int sayi1= oku.nextInt();
        System.out.print("2. Sayıyı Giriniz :");
        int sayi2= oku.nextInt();
        System.out.print("3. Sayıyı Giriniz :");
        int sayi3= oku.nextInt();

        int enb=sayi1;            //burada önemli olan şey en büyük sayıyı ilk sayıya eşitlemek.

        if (sayi2>enb) {enb=sayi2;}
        if (sayi3>enb) {enb=sayi3;}

        System.out.println("enb = " + enb);
        
        
        
        
    }
}
