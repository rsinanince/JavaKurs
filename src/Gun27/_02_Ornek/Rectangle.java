package Gun27._02_Ornek;

public class Rectangle {

    int width;
    int length;

    public void Cevre()
    {
        System.out.println("cevre = "+ 2*(width+length));
    }

    public void Alan()
    {
        System.out.println("alan = " + width*length);
    }

    public int Alan2()  //fazladan yaptık, return ile yazmayı göstermek için
    {
        return (width*length);
    }

}
