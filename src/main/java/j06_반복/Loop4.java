package j06_반복;

public class Loop4 {
    public static void main(String[] args) {

        /*
            1.
            *
            **
            ***
            ****
            *****

            2.
            *****
            ****
            ***
            **
            *

            3.
                *
               **
              ***
             ****
            *****

            4.
            *****
             ****
              ***
               **
                *
        */

        int n = 5;

        // 1번
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // 2번
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // 3번
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){         // n에서 i값 만큼 뺀 수를 공백으로 출력
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){           // i+1 만큼 반복, k값 만큼 * 출력
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // 4번
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){             // j 의 값만큼 공백 출력
                System.out.print(" ");
            }
            for(int k = 0; k < n-i; k++){           // n에서 i값 만큼 뺀 수를 * 로 출력
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < n*2-i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
