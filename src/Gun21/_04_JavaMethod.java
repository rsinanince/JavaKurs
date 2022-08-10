package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    //Kullanıcıdan öğrenci adı ve notlarınız (60 70 90 ... ) şeklinde
    // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
    // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
    // yazdırınız main içerisinde.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        for(int i=0; i<3; i++){
        System.out.print("Öğrenci Adı: ");
        String isim= oku.nextLine();

        System.out.print("Notlar: ");
        String notlar= oku.nextLine();

        int ort=ortalamaBul(notlar);
        System.out.println("isim ve ort = " + isim + " " + ort);
        }
    }
        public static int ortalamaBul(String notlar)
        {
            int ort=0;
            String[] notDizisi=notlar.split(" ");

            int toplam=0;
            for (int i=0; i<notDizisi.length;i++)
                toplam=toplam + Integer.parseInt(notDizisi[i]);

            return toplam/notDizisi.length;
        }


}
