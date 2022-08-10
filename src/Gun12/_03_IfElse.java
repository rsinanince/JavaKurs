package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

//        otopark ücretleri:
//        3 saate kadar 10 TL, 5 saate kadar 15 TL, 5 saatten büyükse 20 TL'dir.
//        kullanıcıdan kaç saat kaldığını alarak ücret yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.println("Saat Bilgisini Giriniz : ");
        int saat = oku.nextInt();

        if (saat <= 3) {
            System.out.println("10 TL");
        } else {
            if (saat <= 5) {
                System.out.println("15 TL");
            } else {
                System.out.println("20 TL");
            }
        }






    }
}
