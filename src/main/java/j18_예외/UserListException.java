package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User{
	private String username;
	private String password;
}

public class UserListException {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);
		
		int length = userList.size() + 1;

		try {
			for(int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			System.out.println();
			for(int i = 0; i < length; i++) {
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
			}
			
		}catch(IndexOutOfBoundsException e) {	// 주어진 값보다 큰값이 들어왔을때 발생
			length -= 1;
			System.out.println(e.getMessage());
			System.out.println();
			try {
				for(int i = 0; i < length; i++) {
					System.out.println("username : " + userList.get(i).getUsername());
					System.out.println("password : " + userList.get(i).getPassword());
				}		
			}catch(NullPointerException e2) {	// 출력하는 값중 null 값이 있을때 발생
				System.out.println(e2.getMessage());
			}
		}
//		catch(NullPointerException e2) {
//			System.out.println(e2.getMessage());
//		}
		catch(Exception e) {	// 모든 catch문 뒤에는 catch(Exception e) 또는 catch(RuntimeException e) 가 존재해야 한다
			e.printStackTrace();
		}finally {	// 예외가 존재하든 안하든 무조건 실행되는 블록
			System.out.println("무조건 실행");
		}
		
		
		System.out.println("프로그램 정상 종료");
	}
}
