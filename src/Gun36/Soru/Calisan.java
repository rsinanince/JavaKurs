package Gun36.Soru;

public class Calisan extends Kisi{
    public Calisan(String ad, String soyad, String gorev) {
        super(ad, soyad, gorev);
    }
    private String departmani;
    public Calisan(String ad, String soyad, String gorev, String departmani) {
        super(ad, soyad, gorev);
        this.departmani = departmani;
    }
    public String getDepartmani() {return departmani;}

    public void setDepartmani(String departmani) {this.departmani = departmani;
    }
    @Override
    public String toString() {
        return "Calisan{" +
                "departmani='" + departmani + '\'' +
                '}';
    }
    public void departman(){
        System.out.println("Muhasebe");
    }
}
