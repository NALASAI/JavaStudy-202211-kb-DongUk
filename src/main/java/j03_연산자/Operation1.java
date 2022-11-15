package j03_연산자;

/*
* 논리연산
* &&(AND) - 곱
* ||(OR) - 합
* !(NOT) - 부정
*
* true(1)
* false(0)
*
* true && true => true
* true && false => false
*
* true || true => true
* true || false => true
* false || false => false
*
* !(true && true) => false
* */

public class Operation1 {
    public static void main(String[] args) {

        boolean a = 100 % 4 == 0;
        boolean b = false;

        System.out.println("<<<< AND 연산자 >>>>");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);

        System.out.println("<<<< OR 연산자 >>>>");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);

    }
}
