package Gun36.Final.attribute;

public class TasitMain {
    public static void main(String[] args) {

        //Tasit t1=new Tasit();
        //t1.model="Honda";   final değişkenleri değiştirilemez.
                              //Tasit class ını final yaptıgımız için değiştirmemize izin vermez.



        Tasit t2=new Tasit("opel");
        //t2.model="honda";

        //bu durumda ise Tasit class ında bir constructor kullanarak
        //sadece 1 kez kullanılmasına izin vermiş olduk.



    }
}
