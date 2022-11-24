package j14_스태틱;

/*
    공유영역(static)

 */

import lombok.Data;

@Data
public class Product {
    private static int autoIncrement = 20220000;
    private int serialNumber;
    public String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;    // 새롭게 만들어질때 마다 autoIncrement+1 하여 할당한다.
        this.name = name;
    }

    public static void print(){
        System.out.println(autoIncrement);      // new Product()를 통해 만들어진 값 중 마지막값을 출력한다
        // 여기서는 private int serialNumber 와 public String name 에 대해 접근이 불가능하다.
//        System.out.println(serialNumber);     | 메모리에 할당해야 사용할 수 있다.
//        Product product = new Product("모니터");
//        System.out.println(product.getSerialNumber());
    }
}
