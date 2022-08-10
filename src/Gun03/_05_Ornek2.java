package Gun03;

import java.io.PrintStream;

public class _05_Ornek2 {

    public static void main(String[] args) {

        //yarı çapı verilen bir dairenin çevresini ve alanını bulununuz.
        //alan = pi*r*r
        //çevre = 2*p*r
        //pi=3.14

        float Pi=3.14F;
        int r = 5;


        Float Alan = Pi*r*r;
        Float Cevre = 2*Pi*r;

        System.out.println("Cevre = " + Cevre);
        System.out.println("Alan = " + Alan);



    }
}
