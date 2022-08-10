package Gun30.DigerErisimler.Iki;

import Gun30.DigerErisimler.Bir.Kitap;

public class AmazonStore {
    public static void main(String[] args) {

//        Kitap kit1=new Kitap();
//        kit1.name = "Yeni java kitabı";

        //Başka paketten kitap class ındaki bu yapıcı metoda ve field a erişemedik
        //çünkü erişim belirteçlerini default yazdık.


        Kitap kit2=new Kitap("Algoritma Kitabı");
        //Başka pakette olmasına rağmen buna erişebildik çünkü
        //kitap class ında bu metodun başına public yazdık.

    }
}
