package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {

        //Math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("a nın değeri : ");
        int a= oku.nextInt();

        System.out.println("b nin değeri : ");
        int b=oku.nextInt();

        System.out.println("c nin değeri : ");
        int c= oku.nextInt();

        //1.yöntem
        int enb= Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb = " + enb);

        //2.yöntem
        int enb2=Math.max(a, Math.max(b,c));
        System.out.println("enb2 = " + enb2);

        //3.yöntem
        System.out.println("enb = " + Math.max(a,Math.max(b,c)));



    }
}
