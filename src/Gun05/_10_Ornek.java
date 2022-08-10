package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {

        //kullanıcıdan kaç bilet istediğini (byte) ve sigorta isteyip istemediğini (boolen olarak)
        //alıp ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bilet Adedi:");
        byte BiletSayisi=oku.nextByte();

        System.out.print("Sigorta İster misiniz:");
        boolean sigortaVarMi=oku.nextBoolean();

        System.out.println("Bilet Sayısı="+BiletSayisi+", sigorta="+sigortaVarMi);





    }
}
