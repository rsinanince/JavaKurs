package Gun36.Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("karabaş");
        Kedi kedi1 = new Kedi("pamuk");

        Hayvan kopek2 = new Kopek("rodi");
        Hayvan kedi2 = new Kedi("tekir");

        kopek1.ses();       //gerçekten kopek, kopek class ındaki fieldları alabildi.
        kopek1.kokladi();   //gerçekten kopek, kopek class ındaki fieldları alabildi.

        kopek2.ses();   //sadece hayvan sınıfına erişebildi. kokladı metodunu alamadı.
        //hayvan gibi ama kopek.
        System.out.println("-----------");

        hayvanSes(kopek1);
        hayvanSes(kedi1);
    }

    public static void hayvanSes(Hayvan h)  //burada ortak bir metod yazabildik.
    {                                       //aslında üst kısımdakilere gerek yoktu.
        h.ses();                            //ortak özelliklerini kullanan böyle bir metod yazarak kısa yoldan çözmüş oluyoruz.
    }                                       //bunun adı polyformphism. farklı şekildekilerin ortak özelliklerini kullanıyoruz.
    //      yazım çıktısı şöyle:
    //      havladı
    //      miyavladı
}
