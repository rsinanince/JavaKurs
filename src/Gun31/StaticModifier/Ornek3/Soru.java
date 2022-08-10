package Gun31.StaticModifier.Ornek3;

public class Soru {     //class kısmı

    int a;

    static int b=0;   //sen bitanesin durumu var. o da en son atılan değerdir.

    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {   //main kısmı   -- böylece hem class hem main kısımlarını aynı sayfada yazabiliyoruz.
        Soru s1=new Soru();
        s1.a=5;

        Soru s2=new Soru();
        s2.a=7;

        //a nın değeri kaç oldu?  -- hangi a diye sormak lazım. 2 farklı a çeşidi var.


        System.out.println("s1.a = " + s1.a);  //5
        System.out.println("s2.a = " + s2.a);  //7

        Soru.b = 6;
        Soru.b = 8;

        //b nin değeri kaçtır?  -- tek bir değeri vardır, en son atanan değerdir.
        System.out.println("Soru.b" + Soru.b);   //Soru.b8


        s1.artir();  // = s1 a=6  , b=9
        s2.artir();  // = s2 a=8  , b=10

        //a nın ve b nin en son değerleri kaçtır?







    }

}
