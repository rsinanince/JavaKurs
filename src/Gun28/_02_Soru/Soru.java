package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {

    // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

        MyMath.getMin(3,5);
        MyMath.getAbs(-5);
        MyMath.getMax(5,8);
        MyMath.getPow(4,9);
        MyMath.getRandom(4,12);

        int[] dizi={2,45,6,77,89};
        MyMath.getDiziElemanlarTopla(dizi);

        System.out.println("MyMath.getMax(3,4) = " + MyMath.getMax(3, 4));


    }
}
