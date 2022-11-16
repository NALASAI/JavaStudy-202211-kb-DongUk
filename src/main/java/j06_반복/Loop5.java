package j06_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String select = null;
        boolean loopFlag1 = true;
        boolean loopFlag2 = true;

        while(loopFlag1){
            System.out.println("[폴더 선택]");
            System.out.println("1. 문서");
            System.out.println("2. 음악");
            System.out.println("3. 사진");
            System.out.println("4. 동영상");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            select = sc.nextLine();
            if(select.equals("1")) {                        // equals : 문자열을 비교할때 사용
                while (loopFlag2){
                    System.out.println("[1. 문서]");
                    System.out.println("1. 대학서류");
                    System.out.println("2. 개인자료");
                    System.out.println("3. 기업정보");
                    System.out.println("b. 뒤로가기");
                    System.out.println("q. 프로그램 종료");

                    System.out.print("메뉴 선택 : ");
                    select = sc.nextLine();

                    if(select.equals("1")) {

                    }else if(select.equals("2")){

                    }else if(select.equals("3")){

                    }else if(select.equals("b")){
                        break;                      // while 문에서 빠져나가기
                    }else if(select.equals("q")){
                        System.out.print("정말 프로그램을 종료하시겠습니까?(Y/N) : ");
                        select = sc.nextLine();
                        if(select.equals("Y")) {
                            loopFlag1 = false;     // loopFlag1과 loopFlag2의 값을 false 로 선언하는것으로
                            loopFlag2 = false;     // 해당 변수를 사용하고 있는 while문에서 탈출하게 만들 수 있다.
                        }
                    }else{
                        System.out.println("다시 입력하세요");
                    }
                }

            }else if(select.equals("2")){

            }else if(select.equals("3")){

            }else if(select.equals("4")){

            }else if(select.equals("q")){
                System.out.print("정말 프로그램을 종료하시겠습니까?(Y/N) : ");
                select = sc.nextLine();
                if(select.equals("Y")) {
                    loopFlag1 = false;
                }
            }else{
                System.out.println("다시 입력하세요");
            }
        }
    }
}
