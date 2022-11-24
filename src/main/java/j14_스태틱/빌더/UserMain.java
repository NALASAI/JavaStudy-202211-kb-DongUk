package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .username("DongUk")
                .email("ebyul96428@naver.com")
                .password("1234")
                .build();
        // builder : 원래 객체를 생성할 때 객체에 있는 모든 내용을 입력해야하지만
        // 빌더 패턴은 원하는 내용만 입력하여 사용할 수 있다.

        System.out.println(user);


    }
}
