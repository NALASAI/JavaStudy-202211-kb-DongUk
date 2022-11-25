package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {
        A.B b = new A().new B("강동욱");
        // 단순히 B 클래스만 객채생성하면 오류가 발생한다.
        // B 클래스의 상위클래스인 A 클래스를 먼저 생성해야 B 클래스를 생성할 수 있다.
        System.out.println(b);
    }
}
