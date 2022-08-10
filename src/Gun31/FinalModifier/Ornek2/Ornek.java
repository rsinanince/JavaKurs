package Gun31.FinalModifier.Ornek2;

import java.util.Scanner;

public class Ornek {

    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gün, saat, dakika alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner oku = new Scanner(System.in);

        System.out.print("Gün="); gun=oku.nextInt();
        System.out.print("Saat="); saat= oku.nextInt();
        System.out.print("Dakika="); dakika= oku.nextInt();

        System.out.println("toplamSaniye =" + Sabitler.hesapla(gun,saat,dakika));

//        Gün=1
//        Saat=1
//        Dakika=1
//        toplamSaniye =90060

    }
}
