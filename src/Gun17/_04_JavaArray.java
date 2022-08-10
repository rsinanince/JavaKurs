package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArray {

    public static void main(String[] args) {

        // 100 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int[] dizi = new int[5];

        Scanner oku = new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < 5; i++){
            System.out.print((i+1)+".Sayı Giriniz = ");
        dizi[i] = oku.nextInt();
        toplam = toplam + dizi[i];
    }
        double ortalama=toplam/dizi.length;

        int adet=0;
        for (int i=0;i< dizi.length;i++){
            if (dizi[i]> ortalama)
                adet++;
        }

        System.out.println("ortalamadan büyük sayı miktarı = " + adet);
    }
}
