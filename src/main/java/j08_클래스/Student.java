package j08_클래스;

public class Student {
    String school;
    String name;
    int studentYear;
    boolean gender;
    
    Student(){}
    
    Student(String s, String n, int sy, boolean g){
        this.school = s;
        this.name = n;
        this.studentYear = sy;
        this.gender = g;
        // this 란 : 주소참조, 자기자신
    }
    
    void showStudentInfo(){
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        if(gender){
            System.out.println("성별 : 남");
        }else{
            System.out.println("성별 : 여");
        }
    }
    
}
