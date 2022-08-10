package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {

//        girilen bir sayıya kadar olan sayılardan sadece tek olanlarının toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça Kadar Sayılar Toplanacak = ");
        int sinir= oku.nextInt();

        int sayac=1;
        int toplam=0;

        while (sayac <= sinir) {

            if (sayac%2==1)   //şarta bağladık
            toplam = toplam + sayac; //toplanacak sayıları sayac temsil ediyor

            sayac++;
        }
        System.out.println("teklerin toplamı = " + toplam);


//        2. yol
        sayac=1;
        toplam=0;
        while (sayac<=sinir){
            toplam = toplam+sayac;
            sayac= sayac+2;  //if kullanmak yerine sayaçı 2 şer ilerlettik. sayaç 1den başladığı için,
        }                    //3, 5, 7,.. şeklinde tekleri toplamış olacak.
        System.out.println("toplam = " + toplam);




    }
}
