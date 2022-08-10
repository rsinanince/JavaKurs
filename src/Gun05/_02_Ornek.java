package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        //girilen bir adı ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Lutfen adınızı giriniz:");
        String ad= oku.next();  //next()-> bir kelime okumak için

        System.out.println("ad = " + ad);

    }
}
