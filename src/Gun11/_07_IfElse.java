package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Yeni Password Giriniz : ");
        String pWord= oku.nextLine();

        if (pWord.length()>=8 && pWord.length()<=12 && pWord.contains("pass")==false) {
            System.out.println("Uygun");}
        else {
            System.out.println("Uygun Değil");}

        //pWord.contains("pass")==false --> ayrıca boolean yazmamıza gerek kalmadı.kısaca bu şekilde yazılabilir.

        //pWord.contains("pass") ---> içeriyorsa
        //!pWord.contains("pass") ---> İÇERMİYORSA
        //!kelime    contains in tersi budur. kısaca böyle yazılır.


    }
}
