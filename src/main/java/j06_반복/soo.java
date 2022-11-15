package j06_반복;

import java.util.Scanner;

public class soo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        int num2 = 0;

        System.out.print("5개의 숫자를 입력하세요 : ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length; j++){
                if(num[i] > num[j]){
                    num2 = num[i];
                    num[i] = num[j];
                    num[j] = num2;
                }
            }
        }

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
