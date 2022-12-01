package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	/*
	 * .serializeNulls() : 값을 표현할때 null 값도 표시
	 * .excludeFieldsWithoutExposeAnnotation() : @Expose 어노테이션 효과 적용할때 사용
	 */
	public static void main(String[] args) {
		// User 객체 생성
		User user = User.builder()
				.username("DongUk")
				.password("1234")
				.name("동욱")
				.email("ebyul96428@naver.com")
				.build();
		
		// Gson 객체 생성
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		// User 객체를 Gson 객체로 변환
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		// 변환되어 있던 Gson객체를 User객체로 재변환 
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
	}
}
