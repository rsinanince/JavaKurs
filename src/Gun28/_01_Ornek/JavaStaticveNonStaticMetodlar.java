package Gun28._01_Ornek;

import java.util.SplittableRandom;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        // 1.Yöntem - Java nın kendi metodlarıyla yapılan çevirme işlemleri

        int sayi=345;
        String strRakam= String.valueOf(sayi);  //int i string e çevirdik
        int intRakam=Integer.parseInt(strRakam);


        // 2.Yöntem - Kendi sınıfımızı yazdık ve oradan kullanıyoruz
        Utility util=new Utility();
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);

        // 3.Yöntem - utility den çağırdık. 2.yöntemin başında olduğu
        // gibi her seferinde tanımlama yapmamıza gerek kalmıyor.
        strRakam = Utility.getString2(sayi);
        intRakam = Utility.getInt2(strRakam);






    }
}
