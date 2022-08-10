package Gun29._01_Constructor;

public class Okul {

    // Bir student sınıfı oluşturunuz (id, name, surName, classroom (int) ve bundan
    // 3 adet öğrenci oluşturunuz.


    public static void main (String[] args) {
        //1.Yöntem
        Student ogr1=new Student();   //() parametre yeri
        ogr1.id=7888;
        ogr1.name="Ali";
        ogr1.surName="Beyaz";
        ogr1.classroom=10;
        System.out.println("ogr1 = " + ogr1.name);

        Student ogr2=new Student();   //() parametre yeri
        ogr2.id=7999;
        ogr2.name="Ercan";
        ogr2.surName="Atik";
        ogr2.classroom=11;
        System.out.println("ogr2 = " + ogr2.name);

        //2.Yöntem
        //ilk 2sinde olduğu gibi tek tek bilgileri yazmak yerine class bölümünde bunları tanımlıyoruz.
        Student ogr3=new Student(3,"Semih","Uzun",7766);
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4,"Mustafa","Bol",5579);
        Student ogr5=new Student(5,"Can","Meriç");
        Student ogr6=new Student(6,"Kemal");
        Student ogr7=new Student(7);


    }
}
