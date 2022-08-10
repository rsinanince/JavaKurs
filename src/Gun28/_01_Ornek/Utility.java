package Gun28._01_Ornek;

public class Utility {

    //2. Yöntem - Nesneye ait olurlar. Her nesne için tekrar yazılırlar.
    public String getString(int sayi)
    {
        return String.valueOf(sayi);
    }

    public int getInt(String strRakam)
    {
        return Integer.parseInt(strRakam);
    }


    //3. Yöntem - Static kelimesini ekledik.
    //Class a ait olurlar. Paket içinde her zaman çalışır.
    //Pratik ama hafızada daha fazla yer kaplar. Gerekmedikçe kullanılmaz.

    public static String getString2(int sayi)  //burada önemli olan static kelimesini eklemek
    {
        return String.valueOf(sayi);
    }

    public static int getInt2(String strRakam)  //static kelimesini ekledik
    {
        return Integer.parseInt(strRakam);
    }

}
