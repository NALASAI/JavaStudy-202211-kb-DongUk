package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(20220001, "강동욱");
        Student student2 = new Student(20220001, "강동욱");

        System.out.println(student.toString());
        System.out.println(student2.toString());

        System.out.println(student == student2);
        System.out.println(student.equals(student2));
        System.out.println(student.equals(student));

        print(student);

        // haseCode() : 주소를 16진수로 변환 후 출력하는 것.
        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(student2.hashCode());
        // 차이점 : 사용 용도가 다름
        // equals 는 해당 내용이 위치한 클래스를 비교하는 방식
        // haseCode 는 삽입된 값만을 대상으로 클래스를 비교하는 방식
        // haseCode() 는 형식은 추상메소드로 되어있으나 native 가 붙어 native 메소드로 분류된다.

        System.out.println();

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        System.out.println();

        Field[] fields = c.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
        }

        System.out.println();

        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
        }
    }
}
