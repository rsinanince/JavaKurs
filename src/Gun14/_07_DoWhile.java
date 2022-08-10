package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {

//        Kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
//        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);

        String okunan="";
        do {
            System.out.println("program çalışıyor");
            System.out.print("ifade giriniz: ");
            okunan=oku.next();
        } while (okunan.equalsIgnoreCase("X")!=true); // okunan x den farklı olduğu sürece çalışacak.
        System.out.println("Program bitti");

    }
}
