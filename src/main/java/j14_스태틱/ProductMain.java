package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {
    
    public static void show(){
        System.out.println("메인메소드에서 호출");
    }
    
    public static void main(String[] args) {
        Product product = new Product("아이폰14");
        Product product2 = new Product("아이폰14Mini");

        System.out.println(product);
        System.out.println(product2);

        product.print(); // heap 영역에 접근할 필요없이 바로 사용이 가능
        product2.print();
        Product.print();

        ProductMain pm = new ProductMain();
        pm.show();
        // 일반 메소드를 static 메소드에서 사용하려면 static 변수를 붙이거나,
        // static 클래스를 선언해야 사용이 가능하다.

        Method1.main(null);
        Method1.method1();
        // 다른 클래스에 있는 메소드를 호출 할 수 있다.
        // private 는 불가능하다
    }
}
