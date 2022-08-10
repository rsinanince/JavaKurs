package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        //bir interface birden fazla class tarafından implement edilebilir.
        //bu örnekte bunu görüyoruz.

        Cember c=new Cember();  //bu yöntemi kullanırsak bütün metodlara erişimimiz olur.
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //bu yöntemle de kullanabiliyoruz.
        //bu bize Polymorphism sağlıyor.
        ICizdirir c2=new Cember();  //bu yöntemi kullanırsak sadece interface deki metodu kullanabiliriz.
        c2.ciz();



    }
}
