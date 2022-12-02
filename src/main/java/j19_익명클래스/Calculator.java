package j19_익명클래스;

// 추상메소드가 2개 이상있을때 에러 발생을 알림 [ 람다 표현시을 사용하는 인터페이스에서만 사용]
@FunctionalInterface
public interface Calculator {

	public int calc(int a, int b);
	
	public default int a() {	// default 메소드는 사용 가능 : 이미 정의된 메소드이므로 사용 가능
		return 10;
	}
}
