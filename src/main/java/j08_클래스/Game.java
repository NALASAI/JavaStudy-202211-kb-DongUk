package j08_클래스;

public class Game{
    String GameName;
    int score;

    Game(){}

    Game(String GN){
        this.GameName = GN;
    }
    
    void movement(String Key){
        score = 0;
        while(true){
            if(Key.equals("W") || Key.equals("w")) {
                System.out.println(GameName + "님이 위로 이동하셨습니다.");
                score++;
            }else if(Key.equals("A") || Key.equals("a")){
                System.out.println(GameName + "님이 왼쪽으로 이동하셨습니다.");
                score++;
            }else if(Key.equals("D") || Key.equals("d")){
                System.out.println(GameName + "님이 오른쪽으로 이동하셨습니다.");
                score++;
            }else if(Key.equals("S") || Key.equals("s")){
                System.out.println(GameName + "님이 아래쪽으로 이동하셨습니다.");
                score--;
            }else if(Key.equals("Q") || Key.equals("q")){
                System.out.println(GameName + "님이 종료하셨습니다.");
                break;
            }else {
                System.out.println("다시 입력하세요");
            }
        }
    }
    
    void showInfo(){
        System.out.println("Game Name : " + GameName);
        System.out.println("Score : " + score);
    }
}
