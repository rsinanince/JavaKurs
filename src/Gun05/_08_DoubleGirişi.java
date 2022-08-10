package Gun05;

import java.util.Scanner;

public class _08_DoubleGirişi {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        //oku.useLocale(Locale.ENGLISH);

        System.out.println("Bir DOUBLE değer giriniz=");
        double deger=oku.nextDouble();

        //TR de , UK de . kullanılıyor.
        System.out.println("deger =" + deger);


    }
}
