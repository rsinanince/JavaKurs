package Gun32._03_Ornek;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparis=new ArrayList<>();

        int secim=0;

        do {
            menu();
            secim = oku.nextInt();

            switch(secim) {
                case 1:Pizza ps = new Pizza(PizzaSize.SMALL);
                    siparis.add(ps);break;
                case 2:Pizza pm = new Pizza(PizzaSize.MEDIUM);
                    siparis.add(pm);break;
                case 3:Pizza pl = new Pizza(PizzaSize.LARGE);
                    siparis.add(pl);break;
                case 4:siparisYaz(siparis);break;
            }
            System.out.println("siparis = " + siparis);
        } while (secim<=4);
    }

        public static void menu() {
            System.out.println("***** PIZZA MENU *****");
            System.out.println("1-Small");
            System.out.println("2-Medium");
            System.out.println("3-Large");
            System.out.println("4-İşleme Al");
            System.out.println("5-Çıkış");
            System.out.print("Seçim : ");
        }

public static void siparisYaz(ArrayList<Pizza> siparis)
{
    int smallCnt=0;
    int mediumCnt=0;
    int largeCnt=0;

    for (Pizza p: siparis){
        if (p.size == PizzaSize.SMALL) smallCnt++;
        if (p.size == PizzaSize.MEDIUM) mediumCnt++;
        if (p.size == PizzaSize.LARGE) largeCnt++;
    }

    System.out.println("large Pizza = " + largeCnt);
    System.out.println("medium Pizza = " + mediumCnt);
    System.out.println("small Pizza = " + smallCnt);
    System.out.println("Siparişiniz Alınmıştır");

        }
}
//TODO : her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız