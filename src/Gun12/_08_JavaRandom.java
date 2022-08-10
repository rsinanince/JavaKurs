package Gun12;

public class _08_JavaRandom {
    public static void main(String[] args) {

//        0 ile 6 arasında random sayı üreten programı yazınız

        double doubleRandomSayi= Math.random();  //Math.random()  -> 0.0000 ile  0.9999 arası sayı üretir.
        System.out.println("doubleRandomSayi = " + doubleRandomSayi);

        int tamSayi= (int) (doubleRandomSayi * 6); // 0 ile 5 arası sayı üretir.
        System.out.println("tamSayi = " + tamSayi);

        //direk yöntem
        System.out.println("tamSayi = " + (int)(Math.random()*6));



    }
}
