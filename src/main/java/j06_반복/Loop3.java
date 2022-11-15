package j06_반복;

public class Loop3 {
    public static void main(String[] args) {

//        for(int dan = 2; dan < 10; dan++) {
//            System.out.println("[" + dan + "단]");
//            for(int i = 0; i < 9; i++){
//                int num = i + 1;
//                System.out.println(dan + " X " + num + " = " + (dan*num));
//            }
//        }

        for(int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for(int j = 0; j < 9; j++){
                int num = j + 1;
                System.out.println(dan + " X " + num + " = " + (dan*num));
            }
        }
    }
}
