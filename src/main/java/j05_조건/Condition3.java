package j05_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {

        String select = null;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("선택 : ");
        select = scanner.nextLine();
        
        switch (select){                        // select에 입력된 값을 이용하여 case를 찾아가는 형식
            case "아침":
                System.out.println("아침식사");     // 특정 조치를 입력하지 않으면 case에 구별하지 않고 계속 실행된다.
                break;                          // break; 를 입력하면 차례대로 실행되지않고 switch 문을 빠져나오게 할 수 있다.
            case "점심":
                System.out.println("점심식사");
                break;
            case "저녁":
                System.out.println("저녁식사");
                break;
            default:
                System.out.println("다시입력하세요");
        }
    }
}

