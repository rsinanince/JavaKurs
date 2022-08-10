package Gun43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _08_JavaCheckedAndUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java nın yazılımcının kontrolüne bıraktığı hatalara Unchecked Exception denir.
        // Ama diğer hataların try-catch e alınmadan kullanılması mümkün değildi. Bu gibi hata durumlarına
        // Checked yani kontrol edilen hatalar denir.

        try {                                                             // 1. yöntem - tercih edilen.
            FileInputStream file = new FileInputStream("liste.txt");  //hata notunun üzerine geldik, more actions dan try-catch yazdırdık.
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        }
        // örnek bir komut yazdık (komut dosyayı okuma işlemini başlatır, dosyayı açar)
        // bunun gibi hatalarda try-catch olmadan program ilerlemez.

        // 2. yöntem - tercih edilmez.
        try {
            dosyaAc();
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        }
    }
    public static void dosyaAc() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("liste.txt");
    }

}

