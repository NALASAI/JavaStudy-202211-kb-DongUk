package j06_반복;

import java.util.Scanner;

public class Loop6 {

    public static boolean selectionConditions(String select, int a, int b){
        boolean loopFlag = true;
        if(select.equals("1")){
            System.out.println(a + " + " + b + " = " + (a+b));
        }else if(select.equals("2")){
            System.out.println(a + " - " + b + " = " + (a-b));
        }else if(select.equals("3")){
            System.out.println(a + " * " + b + " = " + (a*b));
        }else if(select.equals("4")){
            System.out.println(a + " / " + b + " = " + (a/b));
        }else if(select.equals("5")){
            System.out.println(a + " % " + b + " = " + (a%b));
        }else if(select.equals("q")){
            loopFlag = false;
        }else{
            System.out.println("잘못된 입력! 다시입력하세요");
        }

        return loopFlag;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        Scanner sc = new Scanner(System.in);

        boolean loopFlag = true;
        while(loopFlag){
            String select = null;

            System.out.println("사칙연산");
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 나머지");
            System.out.println("q. 프로그램 종료");

            System.out.print("번호 선택 : ");
            select = sc.nextLine();

            loopFlag = selectionConditions(select, a, b);

            System.out.println();
        }

        /*
        1. 덧셈 -> 10 + 2 = 12
        2. 뺄셈 -> 10 - 2 = 8
        3. 곱셈 -> 10 * 2 = 20
        4. 나눗셈 -> 10 / 2 = 5
        5. 나머지 -> 10 % 2 = 0
        q. 프로그램 종료
        (나머지 다른 입력은 "잘못된 입력! 다시입력하세요")
        */
    }
}
