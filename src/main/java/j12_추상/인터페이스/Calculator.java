package j12_추상.인터페이스;

/*
    1. 모든 메소드는 기본적으로 추상 메소드이다.
    2. 변수는 선언할 수 없다.
    3. 상수는 선언할 수 있다.(기본적으로 모든 변수선언은 상수로 선언된다.)
    4. 일반 메소드를 선언하고 싶으면 abstract 대신 default 키워드를 사용한다.
    5. 인터페이스는 생성자를 만들 수 없다.
 */

public interface Calculator {

    public int ERROR_CODE = -99999999;

    public int calc(int[] values);
}
