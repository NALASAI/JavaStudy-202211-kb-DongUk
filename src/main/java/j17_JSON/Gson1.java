package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	public static void main(String[] args) {
		// GSON 생성방법
		Gson gson = new Gson();
		// 첫번째 방법(new Gson()을 입력해서 객체 생성)
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();
		// 두번째 방법(GsonBuilder를 먼저 생성 후 .create()를 입력해 생성 
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "강동욱");
		map.put("email", "ebyul96428@naver.com");
		map.put("address", "부산 부산진구");
		map.put("phone", "01052204331");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		
		map.put("hobby", hobby);
		
		System.out.println(map);
		
		String json = gson2.toJson(map);
		
		System.out.println(json);
		
		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class);
		
		System.out.println(jsonMap);
	}
}
