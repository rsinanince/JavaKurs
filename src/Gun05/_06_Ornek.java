package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz.

        Scanner oku=new Scanner(System.in);

        System.out.print("karenin kenar uzunluğu:");
        int Sayi=oku.nextInt();

        int çevre= 4*Sayi;
        System.out.println("çevre = " + çevre);

        int alan= Sayi*Sayi;
        System.out.println("alan =" + alan);






    }
}
