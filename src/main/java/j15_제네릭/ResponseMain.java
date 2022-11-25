package j15_제네릭;

public class ResponseMain {

    // 와일드 카드
    public static CMRespDto<?> response(String msg, Object data){
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("강동욱")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));

    }
}
