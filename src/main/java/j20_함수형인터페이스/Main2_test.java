package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2_test {
	public static void main(String[] args) {
		List<String> NameLists = new ArrayList<>();
		NameLists.add("동해물과");
		NameLists.add("백두산이");
		NameLists.add("마르고 닳도록");
		NameLists.add("하느님이");
		NameLists.add("보우하사");
		NameLists.add("우리나라");
		NameLists.add("만세");
		
		Supplier<String> SupName = () -> NameLists.get(3);
		
		System.out.println(SupName.get());
	}
}
