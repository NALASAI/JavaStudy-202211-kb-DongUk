package j21_문자열메소드;

public class StringMethod {
	public static void main(String[] args) {
		
		String name = "강동욱김수현";
		
		System.out.println("String 변수명 : str");
		System.out.println();
		System.out.println("str.length()");
		System.out.println(name.length());
		// .length() : 문자열의 길이를 알려주는 메소드
		
		System.out.println();
		
		// .indexOf(문자) : 입력된문자의 위치 찾기(출력은 int)
		System.out.println("str.indexOf()");
		System.out.println(name.indexOf("강"));
		System.out.println(name.indexOf("욱"));
		
		System.out.println();
		// .lastIndexOf(문자) : 뒤에서부터 입력된문자의 위치 찾기(출력은 int)
		System.out.println("str.lastIndexOf()");
		System.out.println(name.lastIndexOf("강"));
		System.out.println(name.lastIndexOf("욱"));
		
		System.out.println();
		
		// .charAt(int) : int자리에 있는 문자 출력
		char name1 = name.charAt(0);
		System.out.println("str.charAt()");
		System.out.println(name1);
		
		System.out.println();
		// .charAt(xxx.indexOf("문자")) : xxx에서 indexOf 메소드로 입력된 문자의 위치를 찾은 후 출력

		System.out.println("charAt(str.indexOf())");
		char name2 = name.charAt(name.indexOf("동"));
		System.out.println(name2);
		
		// .subString(int, int2) : int 인덱스부터 int2 인덱스 전까지 출력 ex) .substring(0, 2) : 0 부터 1까지 출력
		// .subString(int) : int부터 끝까지 출력
		String subName1 = name.substring(0, 2);
		System.out.println("str.substring(int, int)");
		System.out.println(subName1);
		
		System.out.println();
		
		// 강동욱 출력
		// 김수현 출력
		String subName2 = name.substring(0, 3);
		String subName3 = name.substring(3);
		
		System.out.println("str.substring(int A, int B) | A 부터 B-1 까지 출력");
		System.out.println(subName2);
		System.out.println("str.substring(int) | int에서 부터 출력");
		System.out.println(subName3);
		
		System.out.println();
		
		// 다른 답
		String dashName = "강동욱";
		String dashName2 = "김수현";
		
		System.out.println(name.indexOf(dashName2));
		// System.out.println(INDEX.substring(INDEX.indexOf(AT_INDEX), INDEX.indexOf(AT_INDEX) + AT_INDEX.length()));
		System.out.println("String 변수명(A) Astr");
		System.out.println(".substring(str.indexOf(Astr), str.indexOf(Astr) + Astr.length())");
		System.out.println(name.substring(name.indexOf(dashName), name.indexOf(dashName) + dashName.length()));
		System.out.println("String 변수명(B) Bstr");
		System.out.println(".substring(str.indexOf(Bstr), str.indexOf(Bstr) + Bstr.length())");
		System.out.println(name.substring(name.indexOf(dashName2), name.indexOf(dashName2) + dashName2.length()));
		
		System.out.println();
		
		// 실습[파일명과 확장자명을 나눠서 출력]
		String file = "C:/String.java";
		String fileName = null; // 파일명
		String extension = null; // 확장자명
		
		// 나의 답
//		extension = file.substring(file.indexOf(".java"));
//		fileName = file.substring(file.indexOf("String"), file.indexOf("String") + extension.length() + 1);
		
		// C:/ 의 길이(3)부터, 뒤에서부터 "."(10)전까지 출력
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println("C:/ 의 길이(3)부터, 뒤에서부터 문자 " + "." + " 을 찾았을때 위치값(10)까지 출력");
		System.out.println(fileName);
		// 10부터 출력
		System.out.println();
		extension = file.substring(file.lastIndexOf("."));
		System.out.println("뒤에서부터 문자 " + "." + " 을 찾았을때 위치값(10)까지 출력");
		System.out.println(extension);
	}
}
