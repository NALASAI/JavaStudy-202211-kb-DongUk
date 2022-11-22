package j12_추상.추상클래스;

public class Tiger extends Animal{

    public Tiger(String Kind) {
        super(Kind);
    }

    // 부모 클래스에 기본생성자를 정의해 놓으면 자식클래스에서 기본생성자를 정의안해도 문제없이 작동된다.

    @Override
    public void move(){
        System.out.println("호랑이가 네발로 걷습니다.");
    }
}
