package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {

        //      Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        //      ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        //      vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)


        Scanner oku=new Scanner(System.in);

        System.out.print("kilonuz (kg):");
        double Kilo= oku.nextDouble();

        System.out.print("boyunuz (cm):");
        int Boy= oku.nextInt();

        System.out.println("boyunuz ve kilonuz = " + Boy+" " + Kilo);
        System.out.println("vücud kitle indeksi ="+Kilo/(Boy*Boy));

    }
}
