package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notu : ");
        int vizeNot= oku.nextInt();
        System.out.print("Final Notu : ");
        int finNot= oku.nextInt();

//        eğer sonucu double istiyorsak double eşitlemeliyiz.
//        eğer int istiyorsak int e eşitlemeliyiz.
        double ortalama=vizeNot*0.4 + finNot*0.6;
        //int ortInt= (int)(vizeNotu * 0.4) + (int)(finalNotu * 0.6);  -->int istiyorsak boyle olur.

        if (ortalama>=60) {System.out.println("geçtiniz, ortalama="+ortalama);}
        else {System.out.println("kaldınız, ortalama="+ortalama);}






    }
}
