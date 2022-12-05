package j20_함수형인터페이스;

import java.util.function.Function;
import java.util.function.Predicate;

public class Map5 {
	
	public static void main(String[] args) {

		Predicate<Integer> isEven = number -> number % 2 == 0;
		// Predicate<T> : T타입으로 데이터를 받아 boolean값으로 반환하는 인터페이스
		
		Function<Integer, String> isEvenStr = number -> {
			Predicate<Integer> isEven2 = num -> num % 2 == 0;
			
			return isEven2.test(number) ? "짝수" : "홀수";
		};
		
		System.out.println(isEven.test(100));	// true
		System.out.println(isEven.test(101));	// false
		System.out.println(isEven.test(200));	// true
		System.out.println(isEven.test(201));	// false
	
		System.out.println();
		System.out.println(isEvenStr.apply(100)); // 짝수
		System.out.println(isEvenStr.apply(101)); // 홀수
		System.out.println(isEvenStr.apply(200)); // 짝수
		System.out.println(isEvenStr.apply(201)); // 홀수
	}
	
}
