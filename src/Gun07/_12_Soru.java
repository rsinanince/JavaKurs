package Gun07;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {

        //10.ödev sorusu: girilen 3 kelimelik ismi A.Y.T şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("3 kelimelik isim giriniz = ");
        String adAdSoyad = oku.nextLine();

        //Rahmi Sinan İnce
        //R-> 0,   S->1.boşluk+1,  İ->2.boşluk+1

        char ilkHarf=adAdSoyad.charAt(0);
        char ikinciHarf=adAdSoyad.charAt(adAdSoyad.indexOf(" ")+1);
        char üçüncüHarf=adAdSoyad.charAt(adAdSoyad.lastIndexOf(" ")+1);

        System.out.println("Kısa Hali = " + ilkHarf+" "+ikinciHarf+" "+üçüncüHarf);

    }
}
