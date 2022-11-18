package j09_접근지정자.캡슐화;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setSchool("부산가톨릭대학교");
        stu1.setName("강동욱");
        stu1.setYear(4);
        stu1.setGender(true);

        stu2.setSchool("서울대학교");
        stu2.setName("정수기");
        stu2.setYear(2);
        stu2.setGender(false);

        System.out.println(stu1.getName());
        System.out.println(stu2.getName());
        System.out.println();

        System.out.println(stu1.getSchool());
        System.out.println(stu2.getSchool());
        System.out.println();

        System.out.println(stu1.getYear());
        System.out.println(stu2.getYear());
        System.out.println();

        System.out.println(stu1.getGender() ? "남" : "여");
        System.out.println(stu2.getGender() ? "남" : "여");
        System.out.println();

        stu1.showInfo();
        System.out.println();
        stu2.showInfo();
    }
}
