package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
//        kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.

//        Scanner oku=new Scanner(System.in);
//        System.out.print("sayı giriniz = ");
//        int sayi= oku.nextInt();
//
//        int toplam=0;
//        while (sayi != 0){
//            toplam = toplam+sayi;
//
//            System.out.print("sayı giriniz = ");
//            sayi= oku.nextInt();
//        }
//        System.out.println("toplam = " + toplam);

//        ilk yöntemde şartı 2 kez yazıyoruz. 2.yöntemde 1 kez yazabiliyoruz.
        
        //2. yol
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do{
            System.out.print("sayı giriniz = ");
            sayi= oku.nextInt();
            toplam = toplam+sayi;        
                        
        }while (sayi !=0);

        System.out.println("toplam = " + toplam);

    }
}
