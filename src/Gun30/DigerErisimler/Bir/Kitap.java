package Gun30.DigerErisimler.Bir;

public class Kitap {

    String name; //default

    Kitap(){   //default
        //Constructor - yapıcı metod
    }

    public Kitap(String name){   //public
        this.name=name;
        //üsttekiler default olduğu için başka paketten erişilemez ama
        //bu metodun başına public yazdığımız için bu metoda başka paketlerden erişilebilir.
        //böylece bir class içinde bazı metodlara erişilirken bazılarına erişilmemesi sağlanabilir.


    }



}
