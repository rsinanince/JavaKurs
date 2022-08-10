package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

//      girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("bir cümle giriniz= ");
        String cumle= oku.nextLine();

        int birinciBoslukIndex=cumle.indexOf(" ");
        int ikinciBoslukIndex=cumle.indexOf(" ", birinciBoslukIndex+1);
        //bosluk ara ama benim verdiğim index ten sonra ara.
                
        String ilk2Kelime=cumle.substring(0,ikinciBoslukIndex);
        System.out.println("ilk2Kelime = " + ilk2Kelime);
        
        
    }
}
