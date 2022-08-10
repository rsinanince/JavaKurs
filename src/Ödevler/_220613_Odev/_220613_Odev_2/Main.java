package Ödevler._220613_Odev._220613_Odev_2;

public class Main {
    public static void main(String[] args) {

        Employees emp1=new Employees("Ali", 8000, 1997);

        //Employees.ageCalculator();  olmadı, kontrol edilecek.

        if ((2022-emp1.getDob())<18) System.out.println("Come back when you'r 18 yo.");
        else if ((2022-emp1.getDob())==18) System.out.println("We can have an interview");
        else System.out.println("Welcome to our company " + emp1.getName() + ".\nYour salary is : " + emp1.getSalary());






    }

}
