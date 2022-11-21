package j10_배열;

public class Array4 {

    public static int[] add(int[] array, int value){        // 두 배열을 합쳐서 사용할 메소드 선언
        int[] resultArray = new int[array.length + 1];      // 크기는 한 배열을 기준으로 +1 한 크기
        for(int i = 0; i < array.length; i++){
            resultArray[i] = array[i];
        }
        resultArray[array.length] = value;

        return resultArray;
    }

    public static int[] getDuplicateArray(int[] array, int[] array2){// 중복된값 배열
        int[] resultArray = new int[0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array[i] == array2[j]){
                    resultArray = add(resultArray, array[i]);
                }
            }
        }

        return resultArray;
    }

    public static int[] getNonDuplicateArray(int[] array, int[] array2){// 중복되지 않은 값 배열
        int[] resultArray = new int[0];

        for(int i = 0; i < array.length; i++){
            int duplicateCountInArray1 = 0;

            for(int j = 0; j < array2.length; j++){
                if(array[i] == array2[j]){          // 중복이 되면 count가 1 올라간다.
                    duplicateCountInArray1++;
                }
            }
            if(duplicateCountInArray1 != 0){        // count 가 1일때 중복된값은 저장되지 않고 다음값으로 넘어가게 된다.
                continue;
            }
            resultArray = add(resultArray, array[i]);
        }

        for(int i = 0; i < array2.length; i++){
            int duplicateCountInArray2 = 0;

            for(int j = 0; j < array2.length; j++){
                if(array2[i] == array[j]){
                    duplicateCountInArray2++;
                }
            }
            if(duplicateCountInArray2 != 0){
                continue;
            }
            resultArray = add(resultArray, array2[i]);
        }

        return resultArray;
    }

    public static int getMaxNumberInArray(int[] number) {
        int max = number[0];

        for(int i = 0; i < number.length; i++) {
            if(max < number[i]) {
                max = number[i];
            }
        }

        return max;
    }

    public static int getMinNumberInArray(int[] number){
        int min = number[0];
        for(int i = 0; i < number.length; i++) {
            if(min > number[i]) min = number[i];
        }
        return min;
    }

    // 나의 풀이
//        public static int max(int[] number) {
//        int max = number[0];
//        for(int i = 0; i < number.length; i++) {
//            if(max < number[i]) max = number[i];
//        }
//        return max;
//    }
//
//    public static int min(int[] number){
//        int min = number[0];
//        for(int i = 0; i < number.length; i++) {
//            if(min > number[i]) min = number[i];
//        }
//        return min;
//    }
    public static void main(String[] args) {
        
        int[] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] duplicateArray = getDuplicateArray(num1, num2);
        int[] nonDuplicateArray = getNonDuplicateArray(num1, num2);

        int duplicateMinNumber = getMinNumberInArray(duplicateArray);
        int nonDuplicateMaxNumber = getMaxNumberInArray(nonDuplicateArray);

        System.out.println("최소값 : " + duplicateMinNumber);
        System.out.println("최대값 : " + nonDuplicateMaxNumber);

        // 나의 풀이
//        int num = 0;
//        int[] array = new int[5];
//
//        for(int i = 0; i < num1.length; i++){
//            for(int j = 0; j < num2.length; j++){
//                if(num1[i] == num2[j]){
//                    array[num] = num1[i];
//                    num++;
//                }
//            }
//        }

//        System.out.println("최소값 : " + min(array));
//        System.out.println("최대값 : " + max(array));
        
        /* 
        1. 두배열에서 중복된 값 중 최소값
        2. 두배열에서 중복되지않은 값 중 최대값
         */
    }
}
