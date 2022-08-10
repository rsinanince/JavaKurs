package Gun20;

public class _02_JavaMethod {

    //buraya yazılabilir

    public static void main(String[] args) {   //MAIN kısım burada başlıyor BAŞLA

        System.out.println("Merhaba Dünya");   //normalde böyle yazıyoruz.
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(4,5);  //daha önce yazılmış biz çağırıp kullanıyoruz
        //aynı bunun gibi biz de böyle metodlar yazabiliriz.
        //mesela ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        merhabaYaz(); //fonksiyonu çağırma şekli
        merhabaYaz();
        merhabaYaz();

    }  // MAIN kısım burada bitiyor DUR
       //ya da buraya yazılabilir

    public static void merhabaYaz(){ // fonksiyon, metod denilebilir. tekrarlayan komutları bir kez buraya yazıyoruz ve sonra yukarıda istediğimiz kadar çağırabiliyoruz.
        System.out.println("Merhaba Mars");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

}
