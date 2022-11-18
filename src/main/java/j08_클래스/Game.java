package j08_클래스;

import java.util.Scanner;

public class Game{
    Scanner sc = new Scanner(System.in);
    String GameName;
    int score = 0;
    int up = 0;
    int left = 0;
    int right = 0;
    int down = 0;

    Game(){}

    Game(String GN){
        this.GameName = GN;
    }

    boolean movement(boolean a){
        boolean lop = true;
        while(lop){
            String str = sc.next();
            if(str.equals("W") || str.equals("w")) {
                System.out.println(GameName + "님이 위로 이동하셨습니다.");
                up++;
            }else if(str.equals("A") || str.equals("a")){
                System.out.println(GameName + "님이 왼쪽으로 이동하셨습니다.");
                left++;
            }else if(str.equals("D") || str.equals("d")){
                System.out.println(GameName + "님이 오른쪽으로 이동하셨습니다.");
                right++;
            }else if(str.equals("S") || str.equals("s")){
                System.out.println(GameName + "님이 아래쪽으로 이동하셨습니다.");
                down++;
            }else if(str.equals("Q") || str.equals("q")){
                System.out.println(GameName + "님이 종료하셨습니다.");
                score = up + left + right - down;
                lop = false;
            }else {
                System.out.println("다시 입력하세요");
            }
        }
        return false;
    }
    
    void showInfo(){
        System.out.println("Game Name : " + GameName);
        System.out.println("위쪽 이동 : " + up);
        System.out.println("왼족 이동 : " + left);
        System.out.println("오른쪽 이동 : " + right);
        System.out.println("아래 이동 : " + down);
        System.out.println("Score : " + score);
    }
}
