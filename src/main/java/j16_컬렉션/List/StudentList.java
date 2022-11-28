package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        // 업캐스팅 하여 사용

        students.add(new Student(20220001, "강동욱", 21));
        students.add(new Student(20220002, "이승아", 22));
        students.add(new Student(20220003, "문경원", 23));
        students.add(new Student(20220004, "홍지혜", 24));
        students.add(new Student(20220005, "고동완", 25));

        Student student2 = students.get(0);
        System.out.println(student2);

        // 이름이 문경원인 학생의 나이를 26세로 바꾸세요
      
        students.get(2).setAge(26); // 해당 이름의 주소를 알고 있을때 사용

        // 해당 이름의 주소를 모를때 이름을 대상으로 주소를 찾은 뒤 나이 변경
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals("문경원")){
                students.get(i).setAge(26);
                System.out.println(students.get(i));
                break;
            }
        }

        for(Student s : students){
            if(s.getName().equals("문경원")){
                s.setAge(26);
                System.out.println(s);
                break;
            }
        }

        System.out.println();

        // 0번 인덱스 학생의 이름을 다음 인덱스 학생 이름으로 변경
        // 제일 마지막 인덱스의 학생이름으로 0번 인덱스로 이동

        String name = null;
        for(int i = 0; i < students.size(); i++){
            int now = students.size() - 1 - i;  // students 의 크기 - 1 - i 저장     i = 0 | 4
            int pre = now - 1;                  // now 의 값에서 -1 한값 저장   i = 0 | 3
            Student s2 = students.get(now);     // s2의 주소를 students 의 now 번째 주소로 지정 | i = 0 | 4번째 주소 

            if(now == 0){                       // i = 4 일때 발생
                s2.setName(name);               // name 에 저장되어있던 4번째 주소 이름을 저장
                break;
            }

            if(now == students.size() - 1){     // i = 0 일때 발생
                name = s2.getName();            // 기존에 null 되어 있던 name을 가져와서 s2의 이름을 저장(4번째 주소 이름 저장)
            }
            s2.setName(students.get(pre).getName());
            // 자기자신에 자기 앞번호의 이름을 저장 i = 0 | 3번째주소 이름 => 4번째 주소 이름
        }
        System.out.println(students);






    }
}
