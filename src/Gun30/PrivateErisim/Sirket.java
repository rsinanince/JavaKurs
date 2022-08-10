package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();

        cal1.id=1;
        cal1.name="Halil";
        cal1.surName="Fındık";
//      cal1.password="1234";    şifreyi private yaptığımız için böyle yazamayız

        cal1.sifreAta("ggjo7866+");   //diger class ta belirtilen şartlara göre şifreyi atayıp yazdırıyoruz.
        cal1.sifreGoster();



    }
}
