package Ödevler._220613_Odev._220613_Odev_2;

public class Employees {

    private String name;
    private int salary;
    private int dob;

    public Employees(String name, int salary, int dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                '}';
    }
    public static void ageCalculator () {
        //olmadı, kontrol edilecek.
        int yas = 0;
        yas = 2022 - 1997 ;
        System.out.println("yas = " + yas);
    }


}
