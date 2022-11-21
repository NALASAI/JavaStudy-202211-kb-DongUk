package j10_배열;

public class Array5 {

    public static int getMinNumber(int num1, int num2) {
        return num1 < num2 ? num1 : num2;   // num1 과 num2 를 비교하여 작은 값을 반환
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 8, 9, 16, 17};
        int[] nums2 = new int[]{2, 7, 10, 15, 18};
        int[] nums3 = new int[]{3, 6, 11, 14, 19};
        int[] nums4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5];
        /*
        배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.
         */
        for(int i = 0; i < resultArray.length; i++){
            resultArray[i] = getMinNumber(getMinNumber(nums1[i], nums2[i]), getMinNumber(nums3[i], nums4[i]));
            System.out.print(resultArray[i] + " ");
        }
        // 복잡하게 된 나의 풀이
//        for(int i = 0; i < resultArray.length; i++){
//            if(nums1[i] < nums2[i] && nums1[i] < nums3[i] && nums1[i] < nums4[i]){
//                resultArray[i] = nums1[i];
//            }else if(nums2[i] < nums3[i] && nums2[i] < nums4[i]){
//                resultArray[i] = nums2[i];
//            }else if(nums3[i] < nums4[i]){
//                resultArray[i] = nums3[i];
//            }else{
//                resultArray[i] = nums4[i];
//            }
//        }
//        for(int i = 0; i < resultArray.length; i++){
//            System.out.print(resultArray[i] + " ");
//        }
    }
}
