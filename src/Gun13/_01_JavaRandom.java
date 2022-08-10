package Gun13;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

//        1- den 10 a kadar ürettik.
//        5 -> 01234
//        6-10 -> 6789 : aradaki fark kadar 

        Scanner oku=new Scanner(System.in);

        System.out.println("min=");
        int min= oku.nextInt();

        System.out.println("max=");
        int max= oku.nextInt();
        
        int numberInRange=(int) (Math.random() * ((max-min)+1)) +min;//verilen iki sayı arasında sayı üretmek için bu formül kullanılır.

        System.out.println("numberInRange = " + numberInRange);
        

        
        
        

    }
}
