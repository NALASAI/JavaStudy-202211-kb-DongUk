package j11_상속;

public class B extends A{

    private String b;

    public B(){     // 상속 받은 A 라 할지라도 private 를 사용한 경우 get메소드를 통해 사용해야 한다.
        b = getA();
    }
}
