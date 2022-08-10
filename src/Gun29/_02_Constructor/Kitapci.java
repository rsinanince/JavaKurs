package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,autor.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

      Book book1=new Book();       //1.Constructor
      book1.name="Ince Mehmet";
      book1.publisYear=1990;
      book1.author="Yaşar Kemal";

      //2. Constructor
      Book book2=new Book("Nutuk", 1927, "Atatürk");

      //3.Constructor
      Book book3=new Book("Nutuk", 1927);

      book1.Yazdir();  //Ince Mehmet 1990 Yaşar Kemal
      book2.Yazdir();  //Nutuk 1927 Atatürk
      book3.Yazdir();  //Nutuk 1927


        System.out.println(book1);
        //normalde bu şekilde yazdırırken her zaman toString yöntemi ile arar

        String yaziHali=book2.toString();



    }

}
