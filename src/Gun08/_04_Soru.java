package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

//        girilen bir password un sizin bildiğiniz bir kelimeyle eş olup olmadığını bulunuz.
//        şifre= "bayrak"

        String gizliSifre="bayrak";

        Scanner oku=new Scanner(System.in);
        System.out.println("şifreyi giriniz: ");
        String girilenSifre= oku.next();

        System.out.println("Şifre geçerli mi: " + gizliSifre.equals(girilenSifre));
        System.out.println("Şifre geçerli mi: " + gizliSifre.equalsIgnoreCase(girilenSifre));




    }
}
