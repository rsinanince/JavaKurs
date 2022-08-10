package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        
//        Kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Cümle giriniz = ");
        String cumle=oku.nextLine();
        
        int boslukSayisi= 0;
        
        for (int i=0;i<cumle.length();i++) {
            if (cumle.charAt(i) == ' ')
                boslukSayisi++;
        }

        System.out.print("kelime sayısı = " + (boslukSayisi+1));
    }
}
