package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        String str="Bugün";
        int a=5;
        int b=0;
        int c=0;

        //  Catch bloklarında hangi hata önce geliyorsa ona uygun hata mesajı yazılır. Genel Exception en sona yazılır.
        try {
            char ilkHarf=str.charAt(0);  //hata olduğu anda devamı çalışmaz, uygun catch e gider
            c = a / b;
        }
        catch (StringIndexOutOfBoundsException hata)  //burada özel hata ismi yazılırsa ve ilgili hata gelirse
        {                                             //catch kısmı çalışır.
                                                      // ilgili hatanın dışında başka hata gelirse
                                                      // bunun için başka bölüm olmadığından program kırılır.
            System.out.println("Kelime boş olduğu için harf alınamadı");
        }
        catch (ArithmeticException hata)  //bu tür hata olursa aşağıdaki mesaj çıkacak
        {
            System.out.println("sayı sıfıra bölünemez");
        }
        catch (Exception hata)   //yukarıdaki hata türleri dışında bir hata olursa Exception mesajı çıkar.
        {
            System.out.println(hata.getMessage());
        }






    }
}
