package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleTon {

    // 2. 자기 자신을 static 변수로 가지고 있어야 한다.
    private static ScannerSingleTon instance = null;

    @Getter // 하나의 변수에만 Getter 를 사용하고자 할때 사용하는 방식
    private Scanner scanner;

    // 1. 생성자가 private 접근지정자여야 한다.
    private ScannerSingleTon() { scanner = new Scanner(System.in); }
    // private 변수를 사용하고 있어 다른클래스에서는 접근이 불가능하다.(타 클래스에서 생성 불가)

    public static ScannerSingleTon getInstance() {
        // static 변수를 외부로 가져가야하는 상태이므로 static 변수 메소드로 만든다.
        if(instance == null){   // getInstance() 를 호출할때마다 객체를 새롭게 만드는 것을 방지하기 위해 사용 
            instance = new ScannerSingleTon();
        }
        return instance;
    }
}
