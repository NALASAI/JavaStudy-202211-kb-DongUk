package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3_Test {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String str : list) {
			consumer.accept(str);
		}
	}

	public static void main(String[] args) {
		
		List<String> NameLists = new ArrayList<>();
		NameLists.add("동해물과");
		NameLists.add("백두산이");
		NameLists.add("마르고 닳도록");
		NameLists.add("하느님이");
		NameLists.add("보우하사");
		NameLists.add("우리나라");
		NameLists.add("만세");
		
		NameLists.forEach(name -> {
			System.out.println(name);
		});
		
		System.out.println();
		
		forEachTest(name -> {System.out.print(name + " ");}, NameLists);
	}
}
