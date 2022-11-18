package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int foundMaxNumber(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] randomArray = new int[10];
        int sum = 0;

//        for(int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = random.nextInt(10) + 1;
//            System.out.print(randomArray[i] + ", ");
//            if(i+1 == randomArray.length) System.out.println(randomArray[i]);
//            sum += randomArray[i];
//        }

        for(int i = 0; i < randomArray.length; i++) {
            while (true) {
                int randomNumber = random.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {
                    if (randomArray[j] == randomNumber) {
                        // 만약 randomArray[j]에 저장된 값이 새롭게 만든 randomNumber 과 같으면
                        found = false;
                        // 해당 while문은 취소가되고 동일한 숫자가 나오지 않을때까지 반복
                        break;
                    }
                }
                if (found) {
                    // 동일한 숫자가 없을경우 randomArray[i]에 randomNumber 값이 들어가게 된다.
                    randomArray[i] = randomNumber;
                    break;
                }
            }
        }

        for(int i = 0; i < randomArray.length; i++) {
            if(i+1 == randomArray.length) {
                System.out.println(randomArray[i]);
            }else{
                System.out.print(randomArray[i] + ", ");
            }
            sum += randomArray[i];
        }

        System.out.println("총합 : " + sum);

        System.out.println("최소값 : " + foundMinNumber(randomArray));

        System.out.println("최대값 : " + foundMaxNumber(randomArray));
    }
}
