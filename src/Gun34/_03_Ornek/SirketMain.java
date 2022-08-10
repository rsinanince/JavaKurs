package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {

        Calisan cal1= new Calisan("Ali Beyaz", 300, 3600);
        System.out.println("cal1.maasHesapla() = " + cal1.maashesapla());
        System.out.println("cal1 = " + cal1);

        GenelMudur gm1=new GenelMudur("Mehmet Dogu", 300, 3600, 5000);
        System.out.println("gm1.maasHesapla() = " + gm1.maashesapla());
        System.out.println("gm1 = " + gm1);

    }
}
