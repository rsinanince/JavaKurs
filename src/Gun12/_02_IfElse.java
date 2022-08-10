package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

//        girilen bir sayının pozitif negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi= oku.nextInt();

        if (sayi>0){
            System.out.println("pozitif");
        }
        else {
            if (sayi < 0) {
                System.out.println("negatif");
            }
            else {
                System.out.println("sıfır");
            }
        }




            }
}
