package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi) {
        super.Ad = ad; //kendi class ı olsaydı this yazacaktık.
        super.cinsi = cinsi;   //bu class ı extend yaptığımız için başka package daki cinsi ne ulaşabildik.
    }

    @Override
    public String toString() {
        return "P2Kedi{" +
                "Ad='" + Ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
