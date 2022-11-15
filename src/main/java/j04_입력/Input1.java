package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("나이을 입력하세요 : ");
        age = sc.nextInt();
        sc.nextLine();
        // nextInt() 메소드 다음에 nextLine() 메소드를 실행하려고 할때 nextLine()메소드가 그냥 넘어가버리는 오류가 생겨난다.
        // 이 이유는 nextInt()메소드를 실행 할 때 임의의 정수를 콘솔에 입력하고 엔터를 누를때 임의의 정수을 리턴시켰지만
        // Enter값은 그대로 남아있다. nextLine() 메소드는 Enter값을 기준으로 메소드를 종료시키기 때문에
        // nextLine()메소드가 실행될 때 남아있는 Enter값을 그대로 읽어 바로 종료된다.
        // 만약 정수를  입력하고 그다음 문자를 입력하려고 할 때 next() 메소드를 사용하여야 한다.
        // 아니면 위에 nextLine()메소드를 한번더 써줘서 Enter값을 없애줘야한다.
        System.out.print("연락처을 입력하세요 : ");
        phone = sc.nextLine();
        System.out.print("주소을 입력하세요 : ");
        address = sc.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);
    }
}
