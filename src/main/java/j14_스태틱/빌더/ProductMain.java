package j14_스태틱.빌더;

public class ProductMain {

    public static void main(String[] args) {
        Product product = Product.builder()
                .productCode(20220001)
                .productName("사과")
                .price(10000)
                .stock(4)
                .build();

        System.out.println(product);
    }
}
