package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();

        if( score < 0 || score > 100 ) System.out.println("잘못된 점수입니다.");
        else{
            if(90 <= score && score < 101) System.out.println("A학점");
            else if(80 <= score && score < 90) System.out.println("B학점");
            else if(70 <= score && score < 80) System.out.println("C학점");
            else if(60 <= score && score < 70) System.out.println("D학점");
            else System.out.println("F학점");
        }
        /*
            점수가 0보다 작거나 100보다 크면 잘못된 점수입니다. 출력
            90 ~ 100 A학점 출력
            80 ~ 89 A학점 출력
            70 ~ 79 A학점 출력
            60 ~ 69 A학점 출력
            0 ~ 59 A학점 출력
        */
    }
}
