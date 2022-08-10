package Gun03;

public class _07_JavaString {

    public static void main(String[] args) {

        int sayi = 5;

        String ad="Sinan"; //String ifadelerin sayı gibi bir sınırı olmadığından tırnak ile sınırı belli edilir.
        String soyad= "Ince";

        System.out.println("ad");
        System.out.println(ad);
        System.out.println("soyad");
        System.out.println(soyad);
        System.out.println("ad" + "soyad");
        System.out.println(ad+" "+soyad);

        String tamIsim = ad+soyad; //SinanInce
        String tamIsim2 = ad+" "+soyad; //Sinan Ince

        System.out.println("tamIsim = " + tamIsim);
        System.out.println("tamIsim2 = " + tamIsim2);

        int yas=45;
        int kilo=75;

        String bilgi=ad+soyad+yas+kilo;  //sayılar string ile toplanırsa kelime gibi işlem görür

        System.out.println("bilgi = " + bilgi);
        System.out.println(ad+" "+soyad+" "+yas+" "+kilo );



    }
}
