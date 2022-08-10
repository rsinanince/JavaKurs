package Gun29._01_Constructor;

public class Student {

    int id;
    String name;
    String surName;
    int classroom;

    public Student(){
        System.out.println("nesne oluşturuldu");
    }

    //yapıcı metod : constructor
    //ilk oluştuğu anda gerekli tanımlamaları burada yapıyoruz.
    public Student(int id, String name,String surName, int classroom) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.classroom = classroom;
    }

    public Student(int id1, String name1, String surName1){
        this(id1,name1, surName1, 0 );  //this: class ın içinde class dan
                                                 //bahsettiğimizde kullanılır
    }

    public Student (int id1, String name1){
        this(id1,name1,"", 0); //kullanıcıya gerektiği zaman bu bilgileri sunabilmek için bu şekilde yazıyoruz.
                                                //gerekirse de bazı bölümleri boş bırakmak için
                                                //böyle yazıyoruz. mesela kullanıcının surname ve classroom
                                                //bilgilerini girmesini istemiyorsak böyle yazarız.
    }

    public Student (int id1){
        this(id1, "","",0);

        //id=id1;
        //name="";
        //surName="";
        //classroom=0;
    }


}
