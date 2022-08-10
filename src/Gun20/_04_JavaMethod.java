package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekmiCiftMi(55);
        tekmiCiftMi(66);

        tekmiCiftMiOku();
    }
    public static void tekmiCiftMi (int sayi){

        if (sayi %2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }
    public static void tekmiCiftMiOku () {

        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }

}
