package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {
	public static void main(String[] args) {
		
		Function<Integer, String> fx1 = age -> age + "세";
		// Function<T, R> 변수명 = 람다식 : T[파라미터 타입] R[리턴타입]
		// T타입으로 데이터를 받아 R타입으로 변환후 출력 [출력시 변수명.apply(T) 으로 받는다.]
		
		System.out.println(fx1.apply(20));
		
		Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(20) + "입니다";
		
		System.out.println(fx2.apply(age -> age + "살"));
		// 람다식에 람다식으로 작성{ 리턴타입을 function 으로 주는것도 가능}
		
		BiFunction<Integer, String, Map<Integer, String>> createMap = (number, name) -> {
			Map<Integer, String> map = new HashMap<>();
			map.put(number, name);
			return map;
		};
		// BiFunction<T, U, R> : T타입 와 U타입으로 받고 R타입으로 객체를 리턴하는 함수형 인터페이스
		
		List<Map<Integer, String>> list = new ArrayList<>();
		list.add(createMap.apply(100, "강동욱"));
		list.add(createMap.apply(200, "유열림"));
		list.add(createMap.apply(300, "이승아"));
		list.add(createMap.apply(400, "이영인"));
		list.add(createMap.apply(500, "임지현"));
		
		System.out.println(list); // [{100=강동욱}, {200=유열림}, {300=이승아}, {400=이영인}, {500=임지현}]

	}
}