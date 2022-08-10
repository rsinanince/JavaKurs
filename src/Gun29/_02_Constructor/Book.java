package Gun29._02_Constructor;

public class Book {

    String name;
    int publisYear;
    String author;

    //Constructor Method
    public Book(){   //1. Constructor

    }
    //2. Constructor
    public Book(String name, int publisYear, String author){
        this.name=name;
        this.publisYear=publisYear;
        this.author=author;
    }
//3. Constructor (gerekirse kullanılsın diye yazdık)
    public Book(String name, int publisYear){
        this.name=name;
        this.publisYear=publisYear;
        this.author="";
    }

    public void Yazdir(){
        System.out.println(name+" "+publisYear+" "+author);
    }

    public String toString(){
        return name+" "+publisYear+" "+author;
    }

}
