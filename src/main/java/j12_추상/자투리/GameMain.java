package j12_추상.자투리;

import java.util.Random;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bol = true;

        System.out.print("사용자의 이름을 입력하세요 >> ");
        String gameName = sc.nextLine();
        User user = new User(gameName);
        while (true) {
            String str = null;
            int count = 0;
            System.out.println("1. 게임시작");
            System.out.println("2. 점수판");
            System.out.println("q. 게임종료");
            System.out.print("메뉴의 언어를 입력해 주세요 >>> ");
            str = sc.nextLine();
            System.out.println();
            Movement move = new Move();
            Movement RMove = new RMove();

            if (str.equals("1")) {
                while (bol) {
                    System.out.println("게임시작");
                    System.out.println("어느 방향으로 가시겠습니까?");
                    System.out.println("1. 위쪽");
                    System.out.println("2. 오른쪽");
                    System.out.println("3. 왼쪽");
                    System.out.println("4. 아래쪽");
                    System.out.println("5. 게임 저장");
                    System.out.println("b. 뒤로가기");
                    System.out.print("선택 >>>");
                    str = sc.nextLine();
                    Random random = new Random();
                    int a = 0;

                    if (str.equals("1")) {
                        a = random.nextInt();
                        if(a < 4){
                            RMove.Up(gameName);
                            count--;
                            a = 0;
                            System.out.println();
                        }else{
                            move.Up(gameName);
                            count++;
                            a = 0;
                            System.out.println();
                        }
                    } else if (str.equals("2")) {
                        a = random.nextInt();
                        if(a < 4){
                            RMove.Right(gameName);
                            count--;
                            a = 0;
                            System.out.println();
                        }else{
                            move.Right(gameName);
                            count++;
                            a = 0;
                            System.out.println();
                        }
                    } else if (str.equals("3")) {
                        a = random.nextInt();
                        if(a < 4){
                            RMove.Left(gameName);
                            count--;
                            a = 0;
                            System.out.println();
                        }else{
                            move.Left(gameName);
                            count++;
                            a = 0;
                            System.out.println();
                        }
                    } else if (str.equals("4")) {
                        a = random.nextInt();
                        if(a < 4){
                            RMove.Down(gameName);
                            count--;
                            a = 0;
                            System.out.println();
                        }else{
                            move.Down(gameName);
                            count++;
                            a = 0;
                            System.out.println();
                        }
                    } else if (str.equals("5")) {
                        user.setUsername(gameName);
                        user.setScore(count);
                        System.out.println();
                    } else if (str.equals("b")) {
                        System.out.println("메인메뉴로 돌아갑니다");
                        bol = false;
                        System.out.println();
                    } else {
                        System.out.println("다시 입력하세요");
                        System.out.println();
                    }
                }
            }else if (str.equals("2")) {
                System.out.println(user.getUsername());
                System.out.println(user.getScore());
            } else if (str.equals("q")) {
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
