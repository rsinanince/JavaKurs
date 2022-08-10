package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

//          Kısayıp uzayabilir. Dizilerden farkı boyunun uzayıp kısalması. Başka farkı yok.

//          Array: boyut sayısının belli olduğu durumlardaki veriler için kullanılır.
            int[] dizi=new int[5];// Array. 5 elemanlı boyutu sonradan değiştirilemez.


//          ArrayList : Boyutu sonradan değiştirilebilir. Eleman eklendikçe artan, sildikçe azalan dizidir.
//                      Ekle ve sil komutları olacak.

        ArrayList<Integer> integerList=new ArrayList<>();  //tanımlama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

//        Eleman kutucukları en başta yok. Eklendikçe kutucuklar gelecek.
//        Eleman ekleme:

        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Sinan");  //uzunluğu 1 oldu.
        isimler.add("Ayşe");   //uzunluğu 2 oldu.
        isimler.add("Ali");    //uzunluğu 3 oldu.
        isimler.add("Ali");    //uzunluğu 4 oldu.  hep sonuna ekliyor.

        System.out.println("isimler = " + isimler);   //hızlı yazdırma yöntemi
//      isimler = [Sinan, Ayşe, Ali, Ali]    çıktısı budur.

        System.out.println("isimler.size() = " + isimler.size());  //dizilerdeki length in aynısı.
//      isimler.size() = 4

        isimler.add(1,"mehmet");    //araya ekler. sırayı değiştirmez ama istenilen sırada araya ekler.
        System.out.println("isimler = " + isimler);  //isimler = [Sinan, mehmet, Ayşe, Ali, Ali]   araya mehmet eklendi.

        isimler.set(1,"fatih");   //belli bir indexteki elemanı değiştirir.
        System.out.println("isimler = " + isimler);  //isimler = [Sinan, fatih, Ayşe, Ali, Ali]  mehmet yerine fatih geldi.

        int elemanSayisi=isimler.size();   //eleman sayısını bulur.
        System.out.println("eleman sayısı = " + elemanSayisi);   //eleman sayısı = 5

        isimler.remove( "Ayşe");  //menudeki ilk remove yazılan elemanı siler.
        System.out.println("isimler = " + isimler );   //isimler = [Sinan, fatih, Ali, Ali]  ayşe silindi.

        isimler.remove(1);  //menudeki 2. remove index numarası verilen elemanı siler.
        System.out.println("isimler = " + isimler);  //isimler = [Sinan, Ali, Ali]  fatih silindi

        int indexOfAli=isimler.indexOf("Ali");  //belirtilen elemanın index ini verir.
        System.out.println("indexOfAli = " + indexOfAli);  //indexOfAli = 1

        for(int i=0; i<isimler.size(); i++)   //belirtilen index teki elemanı verir.
            System.out.println("isimler = " + isimler.get(i));   //belli bir index teki elemanı get ile alıyoruz.
        //isimler = Ali

        isimler.clear();    //tüm list boşaltılır.
        System.out.println("isimler = " + isimler);  //isimler = []




    }
}
