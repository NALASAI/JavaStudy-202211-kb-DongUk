package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<>();
		// Map의 키값은 Set을 가지고 있기때문에 중복되지 않고, 들어간 순서대로 표기되지 않는다.
		language.put("java", "자바");// 변수명.put(키값, Value)
		language.put("html", "에이치티엠엘"); // Value값은 중복가능하나 키값은 중복되지 못한다.
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬2");
		// putAll() : Map클래스에서 Map클래스로 데이터를 옮긴다.(Map 클래스끼리만 사용 가능하다.)
		
		System.out.println(language);
		
		String s = language.get("java"); // Map 클래스는 Key값이 존재하기때문에 get사용이 가능하다
		System.out.println(s);
		
		language.replace("java", "자바" , "자바2");
		// replace(key, value) : 메소드를 이용한 요소의 수정
		// replace(key, oldValue, newValue) : 기존값까지 정확도를 높혀 요소를 수정하고자 할때 사용
		System.out.println(language.get("java"));
		
		language.remove("python2");
		
		System.out.println(language);
	}
}
