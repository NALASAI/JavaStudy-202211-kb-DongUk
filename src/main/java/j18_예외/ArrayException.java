package j18_예외;

public class ArrayException {
	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] {1, 2, 3, 4, 5};
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(numberArray[i]);
//		} 정상작동
		
		try {
			// 예외가 예상되는 부분
			for(int i = 0; i < 6; i++) {
				System.out.println(numberArray[i]);
			} // ArrayIndexOutOfBoundsException 발생
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);	// 발생한 예외 메시지 출력
			e.printStackTrace();	// 예외가 발생한 위치와 문제점등 정보 출력
			System.out.println(e.getMessage()); // 예외 메시지 중 메시지만 출력
			System.out.println("예외가 생성됨");
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
