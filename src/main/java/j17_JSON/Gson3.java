package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

// JsonElement는 추상클래스 이기에 새롭게 객체를 생성할 수 없다. 

public class Gson3 {
	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("username", "DongUk");
		jsonObject.addProperty("password", "1234");
		// JsonObject : Map 메서드를 Json 형태로 바꿀필요 없이 Json 객체로 바로 생성된다.
		System.out.println(jsonObject);
		
		// JsonArray : Json객체를 Array 형태로 저장
		JsonArray jsonArray = new JsonArray();
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("C#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		
		System.out.println(jsonObject);
	}
}
