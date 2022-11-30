package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import j01_출력.SystemOut;

import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
	public static void main(String[] args) {
		// Map<String, Object> : Value에 Object 값이 들어갔으므로 모든 형태의 데이터가 들어갈 수 있다.
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "DongUk");
		map.put("password", "1234");
		map.put("name", "동욱");
		map.put("email", "ebyul96428@naver.com");
		map.put("age", "27");
		map.put("gender", true);
		
		// Hash 값에 따라 출력되는 순서가 달라진다.(오름차순)
		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "부산진구");
		address.put("address3", "가야동");
		address.put("address4", "가야대로 569");
		
		map.put("address", address); // map의 value에 Object가 들어 갔으므로 Map메소드 속 Map메소드가 가능하다.
		
		Map<Integer, String> subject = new TreeMap<>(); // TreeMap<> : 들어간 순서대로 저장이 된다.
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");		
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);

		// map속 value값이 Object로 저장될때 클래스에서 가져온 데이터를 찾으려할때 해당 클래스 형태로 다운캐스팅을 먼저 해야한다.
		// map.get("subject") 은 Object로 표현되어 있기때문에 Map 상태로 다운캐스팅을 먼저 해야한다[ (Map<Integer, String>) 추가]
		// (Map<Integer, String>)map.get("subject") 을 하나로묶어 map으로 취급되게 하고 .get(key)를 통해 해당 값의 데이터를 반환한다.
		System.out.println(((Map<Integer, String>)map.get("subject")).get(403));
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(((List<String>)map.get("hobby")).get(2));
		
		// Map<Entry<K, V>> : 해당 맵에서 전달된 키와 같거나, 전달된 키보다 큰 키 중에서 가장 작은 키와 그에 대응하는 값의 엔트리를 반환(만약 해당하는 키가 없으면 null을 반환)
		// Set<Map.Entry<K, V>> entrySet() : 해당 맵에 포함된 모든 매핑을 Set 객체로 반환.
		Set<Entry<String, Object>> userEntry = map.entrySet();
		
		System.out.println(map);
		System.out.println(userEntry);

		Set<String> names = new HashSet<>();
		names.add("강동욱");
		names.add("강동이");
		names.add("강동삼");
		names.add("강동사");
		names.add("강동오");
		
		System.out.println(names);
		System.out.println();
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		for(Entry<String, Object> entry : userEntry) { // A : B 에서 B의값을 하나씩 꺼내어 출력
//			System.out.println(entry);	// entry의 key=value 를 한줄씩 출력
//			System.out.println(entry.getKey()); // entry의 Key 값만 출력
//			System.out.println(entry.getValue()); // entry의 Value만 출력
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		
		/*=============================================================*/
		
		Set<String> keys = map.keySet();
		// keySet() : 해당 맵에 포함된 모든 키 값들을 하나의 집합(Set)으로 반환
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("-------------------------------------");
		System.out.println(map.values());
		// Map변수명.values() : Map변수명에 있는 Value값만 가져온다.  
		
		for(Object obj : map.values()) {
			// map 에 저장된 value 값이 Object로 저장되어 있기 때문에 Object를 사용한다
			System.out.println(obj);
		}
		
		
		
		
		
	}
}
