package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {

        int a=5;  //a değeri aşağıdaki parantez bölgesinde geçerli olur.
                  // çünkü dışarıdaki içeriye erişebilir.

        {   //bu parantez arası kendine özel bölge oluşturur ve burada tanımlanan
            // değişkenler sadece burada geçerli olur. kullanım amacı karışıklığı azaltmaktır.

            int b=5;
            b = 77;
            a=8;

            //System.out.println("b = " + b); b değişkenine sadece özel bölgede erişilebilir.

        }  //içeride tanımlanan değişkenler sadece içeride kullanılabilir.

        System.out.println("a = " + a);


    }
}
