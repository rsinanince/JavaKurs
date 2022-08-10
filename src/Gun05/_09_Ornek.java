package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {

        // kullanıcıdan usarname ve şifresinin girişini sağlatınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Usarname :");
        String Usarname=oku.nextLine();

        System.out.print("Password :");
        String Password= oku.nextLine();

        System.out.println("Usarname :" + Usarname);
        System.out.println("Password :" + Password);

        System.out.println("Giriş Başarılı");






    }
}
