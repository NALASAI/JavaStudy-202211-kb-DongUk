package koreaittest.four;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Company{
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
}


public class Main {
	public static void main(String[] args) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.setPrettyPrinting().create();
		
		Company co1 = new Company(100,
				"Apple", "Apple Computer Inc. 1 infinite Loop",
				"Cupertino", "CA", "95014");
		
		String json = gson.toJson(co1);
		System.out.println(json);
	}
}
