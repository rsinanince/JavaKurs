package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {

        //kullanıcının adını ve soyadını ayrı ayrı okutarak alıp
        //birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız:");
        String Ad = oku.next();

        System.out.print("Soyadınız:");
        String Soyad = oku.next();

        System.out.println("Ad Soyad= " + Ad+" "+Soyad);






    }
}
