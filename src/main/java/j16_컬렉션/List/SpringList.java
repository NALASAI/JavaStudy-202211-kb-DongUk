package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Vector;

public class SpringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        // 일반 반복문
//        System.out.println("<<<<< 일반반복 >>>>>");
//        for(int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//
//        System.out.println();
//
//        // ForEach 반복문
//        System.out.println("<<<<< ForEach >>>>>");
//        for(String str : strArray) {    // strArray 가 데이터의 집합이여야 한다.
//            System.out.println(str);    // 들어간 순서대로 출력된다.
//        }

        System.out.println();

        ArrayList<String> strList = new ArrayList<String>(10);
        // 소괄호는 데이터가 들어갈수 있는 크기를 의미
        // 공간이 부족할시 자동으로 1.5배로 늘러난다, 사용하지 않는 공간은 소멸된다.
        // 값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("Jsp");
        strList.add("Servlet");
        strList.add(1, "C++");
        strList.add(0, "HTML");

        System.out.println("<<<<< List ForEach >>>>>");
        for(String str : strList){
            System.out.println(str);
        }

        // 값 조회(Read) -> get(index)
        System.out.println("<<<<< List 일반반복 >>>>>");
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
            // Collection 에는 .get()이라는 메소드가 없다.(키 값이 없을때)
        }

        // 값 수정(Update) -> set(index, value)
        strList.set(0, "HTML5");

        System.out.println("<<<<< List 수정 후 출력 >>>>>");
        System.out.println(strList.toString());

        // 값 삭제(Delete) -> remove(index)
        String removeDate = strList.remove(2);
        System.out.println("<<<<< List 삭제 후 출력 >>>>>");
        System.out.println(removeDate);
        System.out.println(strList.toString());
    }
}
