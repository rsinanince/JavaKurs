package Gun30.Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doktor dok1 = new Doktor();
        dok1.adi = "Ali";

        //protected olanlara sadece kendi paketindekiler erişebilir.
        // bu yüzden burada erişebildik.

        Doktor dok2=new Doktor("Mehmet");

    }
}
