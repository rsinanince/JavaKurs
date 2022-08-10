package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {

//        kullanıcının gireceği 2 sayıdan büyük olanı bulma işlemini bir metodda
//        yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayı : ");
        int sayi1 = oku.nextInt();

        System.out.print("2.sayı : ");
        int sayi2 = oku.nextInt();

        int enb = enbBuyukBul(sayi1, sayi2);
        System.out.println("enb =" + enb);
    }
        public static int enbBuyukBul(int sayi1, int sayi2){
            if (sayi1 > sayi2)
                return sayi1;
            else return sayi2;
        }
}
