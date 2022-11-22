package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {
//        int[] taxPay = {2000000, 2500000, 2600000, 2700000};
        int[] salaryPay = {1000000, 1500000, 1600000, 1700000};
        int[] taxPay = {0, 0, 0, 0};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax();
        result1 = calculator.calc(taxPay);
        if(result1 == 0){
            System.out.println(Calculator.ERROR_CODE);
        }else{
            System.out.println("result1 => " + result1);
        }
        // calculator.calc(new int[] {2000000, 2500000, 2600000, 2700000});
        // 배열형태로 바로 쓸경우 오류가 발생함으로 배열형태 앞에 배열이라 명시해야한다.

        calculator = new Salary();
        result2 = calculator.calc(salaryPay);
        if(result2 == 0){
            System.out.println(Calculator.ERROR_CODE);
        }else{
            System.out.println("result2 => " + result2);
        }
    }
}
