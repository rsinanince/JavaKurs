package Gun31.FinalModifier.Ornek2;

public class Sabitler {

    final static int gunSaat=24;
    final static int saatDakika=60;
    final static int dakikaSaniye=60;

    public static int hesapla(int gun, int saat, int dakika){
        int toplamSaniye = gun*gunSaat*saatDakika*dakikaSaniye
                + saat*saatDakika*dakikaSaniye
                + dakika*dakikaSaniye;

        return toplamSaniye;

    }
}
