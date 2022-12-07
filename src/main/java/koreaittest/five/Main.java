package koreaittest.five;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

class Factory{
	@Getter
	@Setter
	private String factoryName;
	
	private static Factory instance = null;
	
	@Getter
    private Scanner scanner;
	
	private Factory() {
		scanner = new Scanner(System.in);
	}
	
	public static Factory getInstance() {
		
		if(instance == null){ 
            instance = new Factory();
        }
		
		return instance;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = Factory.getInstance().getScanner();
		
		System.out.print("공장 이름을 입력하세요 : ");
		
		Factory.getInstance().setFactoryName(sc.nextLine());
		System.out.println(Factory.getInstance().getFactoryName());
	}
}
