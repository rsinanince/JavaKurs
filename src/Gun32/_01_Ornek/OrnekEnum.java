package Gun32._01_Ornek;

public class OrnekEnum {

    //tanımlama
    enum Aylar {      //default oldu. baş kımsında bir tanım yok. aynı paket içinden ulaşılabilir.
                      //bir simge gibi atama yapacaksak ENUM kullanılır
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

        public static void main(String[] args) {

        int ayno=5;
        Aylar ay=Aylar.MAYIS;

            switch (ay) {
                case SUBAT:System.out.println(28);break;
                case OCAK:
                case MART:
                case MAYIS:
                case TEMMUZ:
                case AGUSTOS:
                case EKIM:
                case ARALIK:System.out.println(31);break;
                case NISAN:
                case HAZIRAN:
                case EYLUL:
                case KASIM:System.out.println(30);break;
            }

            System.out.println("ay = " + ay);  //görünen simge
            System.out.println("ay.name = " + ay.name());   //görünen simge
            System.out.println("ay.ordinal() = " + ay.ordinal());   //indexini

            for(Aylar a: Aylar.values())
                System.out.println(a.ordinal() + " = " + a);




    }
}
