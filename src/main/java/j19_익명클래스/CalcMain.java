package j19_익명클래스;

public class CalcMain {

	public static void main(String[] args) {
// 익명클래스 : 이름없는 클래스, 여러번 사용하는것이 아닌 한번만 사용하고자 할때 사용
//		Calculator c1 = new Calculator() { 
// 필드에 익명인 자식객체를 생성하여 해당 객체에서 인터페이스 에 들어있는 메소드를 재정의하여 사용
//			@Override
//			public int calc(int a, int b) {
//				System.out.println("덧셈");
//				return a + b;
//			}
//			
//		};
		
//		Calculator c1 = (x, y) -> x + y;
		Calculator c1 = (x, y) -> {
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			return x + y;
		};
		// 람다식 : 중간에 다른 실행문이 없는경우 [자료형, return, 중괄호] 등 항목들이 생략된다.
		// 람다 표현식 사용 조건 : 인터페이스 속 추상메소드가 하나만 존재해야 사용가능하다.
		
		System.out.println();
		CalculatorSub cs = x -> x * x;
		
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		System.out.println();
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		System.out.println();
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
	}	
}