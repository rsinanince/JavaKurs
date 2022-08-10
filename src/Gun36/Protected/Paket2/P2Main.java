package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan h2=new P1Hayvan();
        h2.Ad="köpek";   //diğer package dan sadece Ad a ulaşabiliriz, çünkü package.
        //h2.yas       başka package dan ulaşılamaz.
        //h2.cinsi    //protected olduğu için sadece extend durumunda ulaşılabilir.

        P2Kedi kedi1 = new P2Kedi("mırmır", "tekir");
        System.out.println("kedi1 = " + kedi1);

    }
}
