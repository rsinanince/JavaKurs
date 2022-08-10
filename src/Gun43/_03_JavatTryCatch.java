package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavatTryCatch {
    public static void main(String[] args) {

        try {   //hata olması muhtemel yerin başına konulur.
            System.out.println("program başladı");
            LocalDate tarih = LocalDate.of(2022, Month.JUNE, 40);
            System.out.println("işlem tamam");
        }  //hata olduğu zaman programı kırma anlamına gelir.

        catch(Exception hata)  //hata isimli değişkende oluşan hataların bilgisi atanır.
        {
            System.out.println("şu hata oldu" + hata.getMessage());  //şu hata olduInvalid value for DayOfMonth (valid values 1 - 28/31): 40
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

//try catch olmasaydı aşağıdaki çıktıyı alırdık.
//Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
        // Hata kategorisi : DateTimeException
        // Hata açıklaması:  Invalid value for DayOfMonth (valid values 1 - 28/31): 40

        try {
            // java çalışmaya devam

        } // anlamadığın yer mi oldu? kırılmadan devam
        catch (Exception hata)
        {
            //hatanın sebebini anla
            //gereken videoları tekrar izle
            //arkadaşlarına, mentöre, hocaya mutlaka sor
            //öğren ve kırılmadan devam et
        }
        //sonunda seni güzel bir meslek bekliyor



    }
}
