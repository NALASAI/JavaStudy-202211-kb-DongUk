package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .address("부산")
                .name("강동욱")
                .build();
        // Student 객체의 멤버변수인 studentCode, name, address 는 기본값이 null 로 되어있지만
        // .builder()를 이용해 주소하나를 할당하여 그 주소에 값을 추가하고 .build()를 이용해
        // Student.builder()에 저장된 값들을 출력한다.

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder();
        // StudentBuilder 생성
    }
}
