package j13_Object;

import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2);    // true
        System.out.println(str.equals(str2)); // true


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3); // false

        System.out.println(str.toString());
        // 자바 클래스 특징 : toString() 은 Objects 클래스 안에 존재하는 클래스

    }
}
