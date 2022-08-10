package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try {
            startTime=System.currentTimeMillis();
        System.out.println("Hatadan önceki nokta");
        char ilkHarf=str.charAt(0);
        System.out.println("Hatadan sonraki nokta");
        }
        catch (Exception hata)
        {
            System.out.println("Catch bloğu çalıştı");   // hata.printStackTrace();
        }
        finally {//önceki kısımlarda hata olsa da olmasa da her zaman çalışacak bölümdür.
            //burası try-catch in finali. geçen süreyi bunu göstermek için hesapladık.
            long gecenSure=System.currentTimeMillis() - startTime;
            System.out.println("gecen süre : " + gecenSure);
            System.out.println("try catch bloğuyla ilgili son yapılacaklar");
        }
        //hata olsun olmasın her zaman çalışır
        //kullanım sebebi try catch in içinde yapılmış
        //işlemlerde arta kalan kapama gibi bu bölüme ait işlemler yapılarak kod düzeni sağlanmış olur

        System.out.println("try-catch bloğundan sonra çalışan kısım");

    }
}
