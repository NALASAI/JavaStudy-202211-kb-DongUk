package j21_문자열메소드;

public class StringMethod2 {
	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		// 기존 문자열을 대체할 String 생성
		String tempRoles = roles;
		// 0번부터 ","의 위치 전까지 저장 | 만약 ","의 위치를 찾지 못하였을때 -1을 부여해서 거짓으로 만든 후 tempRoles.length()로 반환된다.
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		// 대체된 문자열의 데이터 변경(","을 찾은위치 + 2);
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);

		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);

		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
				
		for(String s : roleArray){
			System.out.println(s);
		}
		
		System.out.println();
		// 문자열A.split(문자열) : 입력된 문자열을 기준으로 문자열A를 잘라 배열생성
		String[] roleArray2 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}
	}
}
