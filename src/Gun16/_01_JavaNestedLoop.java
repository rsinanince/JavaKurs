package Gun16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {

//        2 lerin çarpım tablosu
//        2 x 1 = 2
//        2 x 2 = 4
//        ....

//        for(int i=1;i<=10;i++){
//            System.out.println("2 x "+i+" = " + (2*i));}

        for(int j=1; j<10; j++)
            // 1 için çalışacak sonra 2 için çalışacak sonra 3 için ...
        for(int i=1; i<=10 ;i++){
            System.out.println(j + " x " + i + " = " + (j*i));}   //for içinde for yaptık

    }
}
