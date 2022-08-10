package Gun26;

public class _01_JavaClassAndObject {

    //metodların yazılabildiği yer
    public static void main(String[] args) {
        // ana programın başladığı ve çalıştığı yer (main)

        Araba benimArabam=new Araba();  //Araba tür, benimArabam obje
        benimArabam.renk="Kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2005;

        System.out.println("benimArabam = " +" "+ benimArabam.renk +" "+ benimArabam.motorHacmi +" "+ benimArabam.yili);
        //benimArabam =  Kırmızı 1600.0 2005

    }
    //metodların yazılabildiği yer

}

class Araba{  // bu bölüme class diyoruz ve bu şekilde tanımlanıyor

    String renk;
    int yili;
    double motorHacmi;
}

