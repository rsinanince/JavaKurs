package Gun18;

import java.util.Scanner;

public class _01_JavaArray {

    public static void main(String[] args) {

//        50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
//        doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız,  yazdırınız.

        int [] dizi=new int[50];        //50 elemenalı bir dizi tanımlayınız.

        for(int i=0; i<dizi.length; i++)
            dizi[i] = (int)(Math.random()*10);  //10 a kadar olan sayılardan Random atayarak doldurunuz.}

        for (int i=0; i<dizi.length;i++)
        {
            if (dizi[i]%2==0)
                dizi[i]=2;
            else
                dizi[i]=1;
        }

        for (int i=0; i< dizi.length;i++)
            System.out.println("sonra dizi["+"]="+dizi[i]);

    }
}
