package Gun32._01_Ornek;

public class Ornek1 {
    public static void main(String[] args) {


    // Verilen bir ayNo ya göre, girilen ayın kaç gün sürdüğünü bulunuz.

        int ayNo=5; //verilen 5 olsun

        switch (ayNo){
            case 2:System.out.println(28);
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;
        }
    }
}
