package j12_추상.추상클래스;

public class Human extends Animal{

    public Human(String Kind){
        super(Kind);
    }

//    public Human() {
//        super("사람");    // super() 는 대게 생략되어 있다. 기본적으로 부모의 기본생성자를 호출하지만
//        // 해당 클래스의 기본생성자를 생성하려면 일반 생성자 형식에 따라 매개변수를 입력해야한다.
//    }

    // 생성자를 오버로딩해서 사용하고자하면 생성자에 대한 명시를 해야한다.

    @Override
    public void move(){
        System.out.println("사람이 움직입니다.");
    }
}
