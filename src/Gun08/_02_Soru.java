package Gun08;

import java.util.Scanner;

public class _02_Soru {

    public static void main(String[] args) {

//        Girilen bir kelimenin boş (blank) olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("bir kelime giriniz : ");
        String girilen=oku.nextLine();
        System.out.println("boş mu = " + girilen.isEmpty());






    }
}
