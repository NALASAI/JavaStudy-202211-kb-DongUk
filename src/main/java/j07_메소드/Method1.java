package j07_메소드;

public class Method1 {

    // public static 은 무조건 사용
    // void : return 값이 존재하지 않는다.
        public static void method1() {
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }

    public static int method3(int a, int b) {
        System.out.println("메소드3 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a+b));
        System.out.println();

        return a+b;
    }

    public static int max(int a, int b) {       // int 로 반환되는 메소드는 int 만 반환이 가능하다.
        int result = 0;

        if( a < b ) {
            result = b;
        }else{
            result = a;
        }
        return result;
    }

    public static void main(String[] args) {
        method1();      // 메소드 호출
        System.out.println("메소드1 호출 후 출력");
        System.out.println();

        method2(10);
        
        int result1 = method3(3000, 7000);      // 메소드의 형태가 int 로 되어 있으므로 int 값만 들어가야 한다.
        System.out.println("result1 : " + result1);


    }
}
