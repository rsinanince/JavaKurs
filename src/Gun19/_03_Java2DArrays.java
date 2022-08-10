package Gun19;

public class _03_Java2DArrays {
    public static void main(String[] args) {

        int[] dizi1=new int[3]; //1 boyutlu dizi 3 tane elemanı var
        int[] dizi2={34,56,77}; //1 boyutlu diziyi başlangıç değerleri vererek tanımladık

        //2 ders, 3 öğrencilik bilgileri bir arada tutacak tablo lazım.
        int[][] tablo1=new int[2][3];  //2 satır 3 sütunluk veri, yani 6 elemanlı bir tanımlama yaptık.
        int[][] tablo2={ {23,44,55}, {45,66,77} };  //bu da 6 elemanlı bir tanımlamadır.

        for(int satir=0; satir<2;satir++){

            for (int sutun=0; sutun<3;sutun++) {

                System.out.println(satir + "," +sutun+"="+ tablo2[satir][sutun]);
            }
        }

        int toplam=0;
        for (int satir=0; satir<2;satir++){
            
            for (int sutun=0;sutun<3;sutun++){
                toplam=toplam+tablo2[satir][sutun];   //tablo2[satir][sutun] ->bir sayı
            }
        }

        System.out.println("toplam = " + toplam);
        
        

    }
}
