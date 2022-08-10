package Gun30.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password="";

    public void sifreAta(String sifre)   //şifre atamak için bunu kullanıyoruz.
    {
        if(sifre.length() <8)
            System.out.println("boyle sifre olmaz");
        else
            this.password=sifre;
        System.out.println("Şifre başarıyla atandı");
    }


    public void sifreGoster(){     //şifreyi yazdırmak için bunu kullanıyoruz

        if (password.length() >=8)
        System.out.println("****" + password.substring(4));



    }




}