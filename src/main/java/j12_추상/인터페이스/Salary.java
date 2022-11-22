package j12_추상.인터페이스;

/*
    급여
*/

public class Salary implements Calculator{

    @Override
    public int calc(int[] values) {
        System.out.println("급여 정산을 진행합니다.");
        int result = 0;
        for(int i = 0; i < values.length; i++) {
            result += values[i];
        }

        result = (result - (int)(result * 0.03));

        return result;
    }
}
