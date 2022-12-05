package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll("/", "").replaceAll(" ", "").replaceAll("-", "").replaceAll("[.]", "");
		// .replaceAll("x", "y") : 문자열 x를 문자열y로 전체변환
		// "."의 경우 "[.]"으로 입력해야 정상적으로 작동한다
		
		String phone1 = "0.10-52/20-43 31";
		String phone2 = "010-52/20-4331";
		String phone3 = "0.1052/204331";
		String phone4 = "0.10522043 31";
		
		// 원래라면 들어오는 값마다 새롭게 생성해야하지만
		// 람다식을 만들어 사용하면 반복작업을 줄일 수 있다.
//		phone1 = phone1.replaceAll("-", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone2 = phone2.replaceAll("-", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone3 = phone3.replaceAll("-", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone4 = phone4.replaceAll("-", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		
//		System.out.println(phone1);
//		System.out.println(phone2);
//		System.out.println(phone3);
//		System.out.println(phone4);
		
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));
	}
}