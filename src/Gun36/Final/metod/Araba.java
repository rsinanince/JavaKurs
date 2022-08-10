package Gun36.Final.metod;

public class Araba extends Tasit{

    private String renk;

    public Araba(String model) {
        super(model);
    }
    public void arabaYazdir(){
        System.out.println("renk = " + renk);
    }

//    @Override                     //burada Tasit tan aldığımız metodu değiştirmek istedik ama
//    public String toString() {    //orada Final olarak yazıldığı için değiştirilemez.
//        return super.toString();

}
