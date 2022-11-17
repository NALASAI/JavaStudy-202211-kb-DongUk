package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student("강동욱", "남");
        Student s2 = new Student();

        s2.setName("나나나");
        s2.setGender("여");

        s1.printInfo();
        s2.printInfo();
    }
}
