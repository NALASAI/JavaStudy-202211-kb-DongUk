package j06_반복;

public class Loop2 {
    public static void main(String[] args) {
        /*
            [2단]
            2 x 1 = 2
            2 x 2 = 2
            2 x 3 = 2
            ...
            2 x 9 = 2
        */

        int dan = 2;

        System.out.println("[" + dan + "단]");
        for(int i = 0; i < 9; i++){
            int num = i + 1;
            System.out.println(dan + " X " + num + " = " + (dan*num));
        }
    }
}
