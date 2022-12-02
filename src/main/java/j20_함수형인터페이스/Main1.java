package j20_함수형인터페이스;

public class Main1 {
	public static void main(String[] args) {
		int a = 10;
		
		Runnable application1 = () -> { // 메소드 정의 부분
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a : " + a); // 매개변수를 전할 하지 않은상태인데 전달받아 사용됨
		};// {} 는 매개변수가 없을때는 생략이 불가능하다.
		
		application1.run();
		
		// Runnable 람다 : 함수형 인터페이스로 매개변수 및 반환값이 없다.
//		Runnable timer = () -> {
//			for(int i = 0; i < 100; i++) {
//				try {
//					System.out.println("채팅기능");
//					System.out.println(i + " : " + (i + 1));
//					Thread.sleep(1000);						// 1000(1초) 당 i값 과 i+1 값을 하나씩 출력
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start(); // 기존 방식으로 할때 실행되는 쓰레드
		t2.start(); // t1.start()가 끝날때 까지 기다리지 않고 t2.start()로 바로 옮겨진다.[비동기처리]
		// 기존 순차적으로 처리하는 방식 : 동기처리
		// 
	}
}
