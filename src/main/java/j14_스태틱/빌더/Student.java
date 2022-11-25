package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {    // StudentBuilder 의 반환값을 가진 메소드
        return new StudentBuilder();
    }

    public static class StudentBuilder{ // 내부클래스, static이 붙어 외부클래스가 없어도 존재한다.
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode){ // get 또는 set 을 붙이지 않고 생성(매개변수는
            this.studentCode = studentCode;
            return this;    // 자기자신의 주소 반환
        }

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);
        }
    }
}
