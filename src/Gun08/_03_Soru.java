package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

// girilen bir cümledeki A harfi sayısını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle yazınız: = ");
        String cumle=oku.nextLine();
        int u=cumle.length();

        int u11=cumle.replace("A","").replace("a","").length();
        int u12=cumle.toLowerCase().replace("a","").length();
        int u13=cumle.toUpperCase().replace("A","").length();
        int u14=cumle.replaceAll("[Aa]","").length();

        System.out.println("u-u11 = " + (u-u11)); //yöntem1
        System.out.println("u-u12 = " + (u-u12)); //yöntem2
        System.out.println("u-u13 = " + (u-u14)); //yöntem3
        System.out.println("u-u14 = " + (u-u14)); //yöntem4

    }
}
