package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {
    public void inputName(){
        String name = null;
        Scanner sc = ScannerSingleTon.getInstance().getScanner();
        // getInstance()를 통해 ScannerSingleTon 에서 Scanner 객체를 만든 후
        // getScanner()를 통해 Scanner 객체를 가져온다.

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();

        System.out.println("이름 : " + name);
    }
}
