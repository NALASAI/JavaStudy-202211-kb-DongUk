package j12_추상.인터페이스;

/*
    연말정산
*/

// 오류 해결 1번 : 추상메소드를 가지고 있기때문에 일반 클래스가 아닌 추상 메소드로 만든다.
// 오류 해결 2번 : 추상메소드를 오버라이드하여 재정의 하면 된다.

public class Tax implements Calculator{

    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result += values[i];
        }
        return result;
    }
}
