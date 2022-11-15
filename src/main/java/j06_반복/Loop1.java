package j06_반복;

public class Loop1 {
    // 클래스명 변경 : Shift + F6
    // 클래스 복사 : F5
    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++){    // 0 ~ 9 까지 10번 반복
            System.out.print(i);
            if(i < n-1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print(i + 10);
            if(i < n-1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for(int i = 10; i > 0; i--){        // for(int i = 0; i < n; i++){
            System.out.print(i);            // System.out.print(n-i);
            if(i > 1){                      // if(i < n - 1){
                System.out.print(", ");     //      System.out.print(", ");
            }                               //  }
        }                                   // }

        System.out.println();

        for(int i = 10; i > 0; i--){        // for(int i = 0; i < n; i++){
            System.out.print(i + 10);       // System.out.print(n - i + 10);
            if(i > 1){                      // if(i < n - 1){
                System.out.print(", ");     //      System.out.print(", ");
            }                               //  }
        }                                   // }

        System.out.println();

        for(int i = 0 , j = n; i < n; i++, j--){
            System.out.print(i + ", ");
            System.out.println(j);
        }
    }
}
