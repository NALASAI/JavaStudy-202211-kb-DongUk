package j02_변수;

/*
* 클래스에 대한 설명
* */

public class Variable {
    /*
     * 메소드에 대한 설명
     * */
    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자로형 : " + checkFlag);

        char name1 = '강';
        // char은 한글자만 들어갈 수 있다.
        char name2 = '동';
        System.out.println(name1 + name2);
        // 90094 ~ 이유 : 한글은 아스키코드가 없어 유니코드로 표현된다.
        System.out.println("" + name1 + name2);
        // + 연산을 쓰면 한글은 기본적으로 유니코드로 표현되므로 앞쪽에 ""를 더해서 표현해야한다.
        System.out.println(Integer.toHexString(name1));
        System.out.println("\uac15");

        int width = 100;
        int width2 = 200;
        System.out.println(width + width2);

        String swidth = "100";
        String swidth2 = "200";
        System.out.println(swidth + swidth2);
        // 문자열은 숫자로 더해지지 않는다.

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<< 형 변환 >>>>");

        // 업캐스팅
        // 문자 -> 정수 -> 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println((int)c1 + 10);
        int n1 = c1;
        System.out.println(n1);
        double d1 = n1;
        System.out.println(d1);

        // 다운캐스팅
        // 실수 -> 정수 -> 문자
        int n2 = (int) d1;                  // 실수를 정수로 재변환
        System.out.println(n2);
        char c2 = (char) n2;                // 정수를 실수로 재변환
        System.out.println(c2);
        // 업캐스팅의 경우 기존의 변수보다 큰 변수에 값을 넣는것이기에 (int)와 같은 내용은 사용하지 않아도 되나
        // 다운캐스팅의 경우는 기존의 변수보다 작은 변수에 값을 넣는것이기 때문에 (int)와 같은 내용을 반드시 사용해야 한다.
    }
}
