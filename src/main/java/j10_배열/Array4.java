package j10_배열;

public class Array4 {
    
    public static int max(int[] number) {
        int max = number[0];
        for(int i = 0; i < number.length; i++) {
            if(max < number[i]) max = number[i];
        }
        return max;
    }

    public static int min(int[] number){
        int min = number[0];
        for(int i = 0; i < number.length; i++) {
            if(min > number[i]) min = number[i];
        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int[] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int num = 0;
        int[] array = new int[5];

        for(int i = 0; i < num1.length; i++){
            for(int j = 0; j < num2.length; j++){
                if(num1[i] == num2[j]){
                    array[num] = num1[i];
                    num++;
                }
            }
        }

        System.out.println("최소값 : " + min(array));
        System.out.println("최대값 : " + max(array));
        
        /* 
        1. 두배열에서 중복된 값 중 최소값
        2. 두배열에서 중복된 값 중 최대값
         */
    }
}
