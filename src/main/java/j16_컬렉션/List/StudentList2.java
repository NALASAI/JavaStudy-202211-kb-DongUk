package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {
    public static void main(String[] args) {
//        List<String> nameList = Arrays.asList(new String[]{"강동욱", "강동이", "강동삼"});
//        Object[] nameArray = nameList.toArray();
//        ArrayList 로 변환된 내용을 Objects 배열로 재변환
//        System.out.println((String) nameArray[0]);

        List<Hobby> HL = Arrays.asList(new Hobby[]{
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")
        }); // Arrays.asList : 배열을 ArrayList 로 변환하는 동작

        for(Hobby h : HL) {
            System.out.println(h);
        }

        Student s1 = Student.builder()
                .studentId(20220001)
                .name("강동욱")
                .age(27)
                .hobbyList(Arrays.asList(new Hobby[]{HL.get(0), HL.get(2)}))
                // Hobby 객체에서 특정한 값들만 가져와 새롭게 리스트를 만들어 hobbyList 에 저장
                .build();

        Student s2 = Student.builder()
                .studentId(20220002)
                .name("강동이")
                .age(26)
                .hobbyList(Arrays.asList(new Hobby[]{HL.get(3), HL.get(1)}))
                .build();

        Student s3 = Student.builder()
                .studentId(20220003)
                .name("강동삼")
                .age(28)
                .hobbyList(Arrays.asList(new Hobby[]{HL.get(1), HL.get(2)}))
                .build();

        System.out.println(s1);
        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student s : sl){
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미 >");
            for(Hobby h : s.getHobbyList()){
                System.out.println(h);
            }
        }
    }
}
