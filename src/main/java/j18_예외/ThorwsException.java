package j18_예외;

public class ThorwsException {
	
	public static void printArray(int[] numbers) throws Exception{
		// throws Exception : 해당 구문이 붙은 메소드에서 예외가 발생할 수 있다는것을 암시 
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		
		try {
			printArray(nums);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
}
