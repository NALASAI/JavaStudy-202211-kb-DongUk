package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 매개변수 칸에 업캐스팅으로 모든 클래스가 들어 갈 수 있다.
        // == : 주소비교 | 일반적으로는 주소가 다르기 때문에 false 가 나오지만
        // 재정의를 통해 주소를 비교하는것이 아닌 값을 대상으로 비교하여 동일 여부를 결정할수 있게 한다.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;  // Object 객체를 Student 객체로 다운캐스팅
        return code == student.code && Objects/*여러 기능이 내장된 유틸리티*/.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
