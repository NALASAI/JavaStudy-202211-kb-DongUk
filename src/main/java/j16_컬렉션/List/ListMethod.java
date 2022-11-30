package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {

	public static void printList(String listName, List<String> list) {
		System.out.println(" [ "+ listName +" ] ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(i + " ->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();
		
		// add() -> 리스트에 값을 추가
		nameList.add("강동욱");
		nameList.add("신경수");
		nameList.add("임지현");
		nameList.add("고희주");
		nameList.add("문승주");
		nameList.add("장건녕");
		nameList.add("박수현");
		
		// addAll() -> 리스트에 다른 Collection의 값을 모두 추가함
		nameList2.addAll(nameList);
		printList("nameList", nameList);
		nameList2.addAll(3, nameList); // 앞에 int 값을 넣는것으로 해당 int값 순서부터 다시 addAll()을 실행하고 나머지 리스트를 이어간다.
		printList("nameList2", nameList2);
		
		// contains() -> 리스트에 해당 값의 여부 확인(boolean 타입 반환)
		boolean isContains = nameList.contains("장건녕");
		System.out.println("< contains() >");
		System.out.println("이름 목록에 장건녕이 있습니까? " + (isContains ? "있다" : "없다"));
		System.out.println();
		
		// indexOf() -> 리스트에 해당 값의 인덱스 위치를 반환
		int index = nameList.indexOf("고희주");
		System.out.println("< indexOf() >");
		System.out.println("리스트에서 고희주의 인덱스 위치 : " + index);
		System.out.println();
		
		// lastIndexOf() -> 리스트에 해당 값의 인덱스 위치를 반환(뒤에서 부터 탐색)
		int lastIndex = nameList2.lastIndexOf("임지현");
		System.out.println("< lastIndexOf() >");
		System.out.println("리스트에서 임지현의 인덱스 위치 : " + lastIndex);
		System.out.println();
		
		// isEmpty() -> 리스트의 비어있는지 확인
		boolean isEmpty = nameList.isEmpty();
		System.out.println("< isEmpty() >");
		System.out.println("해당 리스트가 비어있는가? " + isEmpty);
		System.out.println();
		
		System.out.println("< forEach >");
		for(String name : nameList) {
			 System.out.println(name);
		}
		System.out.println();
		
		// Iterator<T> : 해당 리스트의 반복자(iterator)를 반환
		Iterator<String> ir = nameList.iterator();
		// is : ~ 이다 , 아니다 | has : ~ 있다 , 없다
		System.out.println("< Iterator<T> >");
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println();
		
	}
}
