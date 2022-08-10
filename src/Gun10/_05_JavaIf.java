package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

//        girilen bir sayının birler basamağını yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi= oku.nextInt();

        int birler=sayi%10;

        if (birler==0){System.out.println("birler basamağı: sıfır");}
        if (birler==1){System.out.println("birler basamağı: bir");}
        if (birler==2){System.out.println("birler basamağı: iki");}
        if (birler==3){System.out.println("birler basamağı: üç");}
        if (birler==4){System.out.println("birler basamağı: dört");}
        if (birler==5){System.out.println("birler basamağı: beş");}
        if (birler==6){System.out.println("birler basamağı: altı");}
        if (birler==7){System.out.println("birler basamağı: yedi");}
        if (birler==8){System.out.println("birler basamağı: sekiz");}
        if (birler==9){System.out.println("birler basamağı: dokuz");}



    }
}
