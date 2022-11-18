package j08_클래스;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        g1.GameName = sc.next();

        if (g1.GameName != null) {
            g1.movement(true);
        }

        g1.showInfo();
    }
}
