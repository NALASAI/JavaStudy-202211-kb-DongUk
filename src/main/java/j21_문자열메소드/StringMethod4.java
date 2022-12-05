package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN, GUEST";
		roles = roles.replaceAll(" ", "");
		
		String[] roleArray = roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);
		
		System.out.println(roleList);
		
		roleList.forEach(role -> {
			// prefix(접두어) startsWith
			// subfix(접미어) endWith
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				System.out.println("권한 : " + role);	
			}
		});
		// .startsWith(문자열) : 입력된 문자열로 시작되는지 여부 확인
		// .equalsIgnoreCase : 대소문자 구분없이 단순히 글자로만 구별
	}
}