package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<>();
		
		nameSet.add("강동욱");		
		nameSet.add("강동이");		
		nameSet.add("강동삼");		
		nameSet.add("강동사");		
		nameSet.add("강동오");		
		nameSet.add("강동육");
		
		System.out.println(nameSet);
		// Set은 값을 넣은 순서대로 출력되진 않는다.

		for(String s : nameSet) {
			if(s.equals("강동욱")) {
				System.out.println(s);	
				break;
			}
		} // 원하는 값 1개만 꺼낼때 사용
		
		List<String> nameList = Arrays.asList(new String[] {"강동욱", "권중우"});
		
		System.out.println(nameList);
		
		Set<String> listTotest = new HashSet<String>();
		// HashSet : Set 인터페이스를 구현
		listTotest.addAll(nameList);
		// addAll() : 리스트속 데이터를 Set으로 옮길수 있는 명령어 | Map메소드는 Collections 인터페이스를 상속받지 않아 사용 불가능하다
		
		System.out.println(listTotest);
		
		nameSet.remove("강동욱");
		
		System.out.println(nameSet);
		// Set에서 업데이트 개념이 없어 갱신하려 하면 삭제 후 추가를 동시에 일어나게끔 해야한다.
	}
}
