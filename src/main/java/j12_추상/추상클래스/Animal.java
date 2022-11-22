package j12_추상.추상클래스;

/*
    추상 메소드를 하나라도 포함하는 클래스는 추상클래스로 정의해야 한다.
 */

public abstract class Animal {

    private String name;

    public Animal(){};

    // 추상클래스에 생성자도 나올 수 있다.
    public Animal(String kind) {
        System.out.println(kind + "이(가) 생성되었습니다.");
    }

    // 추상메소드
    public abstract void move();   // 추상메소드는 구현부가 필요없으므로 {}를 제거해도 된다.

    public void eat(){ // 추상클래스여도 일반 메소드를 생성할 수 있다.
        System.out.println("동물이 밥을 먹습니다.");
    }
}
