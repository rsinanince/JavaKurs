package Gun36.Protected.Paket1;
//aynı package içindeki erişim konularını gördük şimdiye kadar.
public class P1Main {
    public static void main(String[] args) {

        P1Hayvan h=new P1Hayvan();
        h.Ad="karakedi";  //public, ulaşılabiliyor
        h.yas=2;          //default, ulaşılabiliyor
        h.cinsi="tekir";  //protected, ulaşılabiliyor
        // h.renk : buna ulaşamıyoruz çünkü private. sadece kendi class ının içinden ulaşılır.



    }
}
