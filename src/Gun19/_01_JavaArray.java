package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {

        //100 elemanlı bir diziyi random (0-100) doldurduktan sonra
        //sadece tek elemanlarınızı bir başka diziye atayınız.

        int [] dizi=new int[10]; //uzun olmasın diye 10 eleman yaptık
        int [] tekler=new int[10]; //uzun olmasın diye 10 eleman yaptık
        System.out.println("once tekler = " + Arrays.toString(tekler));

        for (int i=0;i< dizi.length;i++)
            dizi[i]=(int) (Math.random()*100);

        for (int i=0;i<dizi.length;i++)
            if(dizi[i] %2 ==1)
                tekler[i]=dizi[i];

        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekler = " + Arrays.toString(tekler));


    }
}
