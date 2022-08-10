package Gun40.Ornek4;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<Food> siparis = new ArrayList<>();

        int secim = 0;

        do {
            menumuz();
            secim = oku.nextInt();

            switch (secim) {
                case 1: AdanaKebap aKebap = new AdanaKebap() {
                        @Override
                        public void taste() {
                            System.out.println("acılı adana");}
                        @Override
                        public double ucret() {
                            System.out.println(55);
                            return 0;}  };
                    siparis.add(aKebap); break;
                case 2: Lahmacun lahmcn = new Lahmacun() {
                        @Override
                        public void taste() {
                            System.out.println("gevrek");}
                        @Override
                        public double ucret() {
                            System.out.println(33);
                            return 0;} };
                    siparis.add(lahmcn); break;
                case 3: Borsh brsh = new Borsh() {
                        @Override
                        public void taste() {
                            System.out.println("ekşi");}
                        @Override
                        public double ucret() {
                            System.out.println(33);return 0;}};
                    siparis.add(brsh); break;
                case 4: Palov plv = new Palov() {
                        @Override
                        public void taste() {
                            System.out.println("tuzlu");}
                        @Override
                        public double ucret() {
                            System.out.println(44);
                            return 0;} };
                    siparis.add(plv);break;
                case 5: System.out.println("Tamam");}
            System.out.println("sipariş : " + siparis);
        } while (secim == 5);
    }
    private static void menumuz() {
        System.out.println("****MENU****");
        System.out.println("1-Adana Kebap (55TL)");
        System.out.println("2-Lahmacun (33TL)");
        System.out.println("3-Borsh (33 TL)");
        System.out.println("4-Palov (44 TL)");
        System.out.println("0-Tamam");
        System.out.print("Seçiminiz : ");
        }

    }