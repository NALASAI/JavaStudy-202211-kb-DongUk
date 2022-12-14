package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException{
	// 경고줄 발생시 serialVersionUID 추가
	private static final long serialVersionUID = 1L;

	Map<String, String> errorMap;
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	public void printErrorMap() {
		Objects.requireNonNull(errorMap);	// errorMap 이 Null 일시 NullpointrException 발생
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
		System.out.println();
	}

}