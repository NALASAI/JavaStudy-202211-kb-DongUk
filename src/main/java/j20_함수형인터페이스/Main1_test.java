package j20_함수형인터페이스;

public class Main1_test {
	public static void main(String[] args) {
		int num = 100;
		
		Runnable RunNum = () -> {
			System.out.println("num" + num);
			System.out.println();
		};
		
		RunNum.run();
		
		Thread th1 = new Thread(() -> {
			for(int i = 0; i < 20; i++) {
				try {
					int gx = i * (i+1);
					System.out.println(gx);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread th2 = new Thread(() -> {
			for(int i = 1; i < 21; i++) {
				try {
					int gx = i * (i+1);
					System.out.println(gx);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		th1.start();
		th2.start();
	}
}
