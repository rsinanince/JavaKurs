package Gun30.DigerErisimler.Bir;

public class Kitapci {
    public static void main(String[] args) {

        Kitap kit1=new Kitap();   //aynı pakette olduğu için erişebiliyor
        kit1.name = "Yeni java kitabı";

        Kitap kit2=new Kitap("Algoritma Kitabı");
    }

}
