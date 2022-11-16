package j06_반복;

public class Continue {
    public static void main(String[] args) {

        int count = 0;

        while(true) {
            count++;
            System.out.println("나무를" + count + "번 찍습니다.");
            if(count < 10){
                continue;
                // 반복문 속 조건문에서 사용되며 해당 조건이 만족될 시 해당 반복을 종료하고 다음 회차의 반복으로 넘어간다.
            }
            System.out.println("나무가 넘어갑니다.");
            break;
        }
    }
}
