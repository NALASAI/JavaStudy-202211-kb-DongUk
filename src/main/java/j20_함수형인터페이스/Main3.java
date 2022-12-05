package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3 {
	
	// Consumer객체(구현과 생성이 이루어진 람다식), 
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s); // accepts(x) : Consumer 객체의 추상메소드
			// 들어온 람다식을 실행한다.
		}
	}
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("강동욱");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");		
		
		names.forEach(n -> {
			// forEach 메소드는 Consumer라는 인페이스를 매개변수로 받는다. 
			// n : Consumer 객체를 생성할때 들어간 자료형으로 받는다.[String이 들어갔으므로 String]
			// names의 메소드로 들어갔으므로 names속 자료를 하나씩 꺼네어 실행
			System.out.println(n);
		});
		
		System.out.println();
		
		forEachTest(n -> {System.out.println(n);}, names);
		// accpets(x) 를 @Override 한것 => n -> {System.out.println(n);} 
		// accpets 에 들어가서 출력되는 내용 System.out.println(n);
		
		System.out.println();
		
		/*-----------------------------------------------------------------------------------------------*/
		
		// Map 함수 반복
		Map<String, String> subject = new HashMap<>();
		
		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javascript", "자바스크립트");
		subject.put("C", "C언어");
		subject.put("Node.js", "노드제이에스");
		
		// 1. Set<String>
		System.out.println("Set<String>");
		Set<String> keySet = subject.keySet();
		keySet.forEach(key -> {
			System.out.println(subject.get(key));
		});
		
		System.out.println();
		// 2. Set<Entry<String, String>>
		System.out.println("Set<Entry<String, String>>");
		Set<Entry<String, String>> entrySet = subject.entrySet();
		entrySet.forEach(entry ->{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
	
		System.out.println();
		// [2]번 방법의 축약형
		System.out.println("[2]번 방법의 축약형");
		subject.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
	}
}
