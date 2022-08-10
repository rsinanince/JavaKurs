package Gun28._03_Soru;

import java.util.ArrayList;

public class Student {

    String name;
    int maxCredit;
    ArrayList<Lesson> dersleri= new ArrayList<>();

    public void dersEkle(Lesson ders){

        //gelen dersin kredisi ve var olan krediyi toplayıp
        //kredi limitini aşıyor mu kontrol edeceğiz.
    int toplamAlinanKredi=0;
    for (Lesson l: dersleri)
        toplamAlinanKredi+= l.credit;

    if (toplamAlinanKredi+ders.credit <= maxCredit){
        dersleri.add(ders);
        System.out.println("Eklendi = "+ ders.name);}
    else
        System.out.println("Kredi Limiti Aşıldı = " + ders.name );


    }

}
