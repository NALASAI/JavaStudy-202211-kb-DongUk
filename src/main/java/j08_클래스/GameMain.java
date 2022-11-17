package j08_클래스;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        g1.GameName = "Game";
        String key1 =  sc.next();

        g1.movement(key1);

        g1.showInfo();
    }
}
