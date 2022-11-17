package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("부산대학교", "홍길동", 3, true);

        student.school = "서울대학교";
        student.name = "김예지";
        student.studentYear = 2;
        student.gender = false;

        student.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();
    }
}
