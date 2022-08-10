package Gun37._01_Ornek;

public interface IMagaza {

    public void bilgileriAl();
    public void kredibiliteyiKontrolEt();

}

//yapılacak projenin ana menüleri Interface class ı olarak buraya yazılır.
//Bunlar burada sadece başlık olarak kayıt altına olunmuş olur
//Miras veren diğer class ise bu başlıkları implements yöntemi ile buradan almak zorundadır.
//Yeni eklemeler gerektiğinde bu class a eklenir ve miras verecek class bu sonradan eklenenleri yine
//almak zorundadır.