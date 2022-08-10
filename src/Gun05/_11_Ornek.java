package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan cadde, sokak, posta kodu (int) ve ülke şeklinde
        //adres bilgisi alarak yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cadde="); String Cadde= oku.nextLine();

        System.out.print("Sokak="); String Sokak= oku.nextLine();

        Scanner oku2=new Scanner(System.in);
        System.out.print("Posta Kodu="); int PostaKodu= oku2.nextInt();

        System.out.print("Ulke="); String Ulke=oku.nextLine();






    }
}
