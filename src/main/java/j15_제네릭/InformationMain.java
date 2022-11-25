package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {
        Student student = Student.builder().studentCode(20220001).name("강동욱").build();

        Teacher teacher = Teacher.builder().teacherCode(200).name("김준일").build();

        Information<Student> studentInformation = new Information<Student>(student);
        // T 자리에 Student 가 잡혀 자료형이 Student 가 된다.
        Information<Teacher> teacherInformation = new Information<Teacher>(teacher);
        // T 자리에 Teacher 가 잡혀 자료형이 Teacher 가 된다.
        Information2 i1 = new Information2(student);    // Object 타입
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름 : " + studentInformation.getTarget().getName());
        System.out.println("학생이름2 : " + (((Student)i1.getTarget()).getName())); // 일일히 다운캐스팅을 사용해야 한다.
    }
}
