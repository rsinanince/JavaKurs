package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        int sayi; //daha önce değişkeni bu şekilde tanımlıyorduk. 1 tane yer açtı
        int[] dizi=new int[5]; // 0,1,2,3,4 indexli 5 adet sayılık yer açtı hafızada

        System.out.println("dizi.length = " + dizi.length);

        Scanner oku=new Scanner(System.in);
        for(int i=0; i<dizi.length;i++){

            System.out.print("Sayi giriniz=");
           dizi[i]=oku.nextInt();
        }

        System.out.println("dizi[4] = " + dizi[4]);


    }
}
