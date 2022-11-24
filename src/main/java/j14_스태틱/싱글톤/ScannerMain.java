package j14_스태틱.싱글톤;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner1 s1 = new Scanner1();
        Scanner2 s2 = new Scanner2();

        s1.inputName();     // 주소 100번 할당
        s2.inputAge();      // s1 에서 instance 가 이미 만들어 졌으므로 s1 의 인스턴스가 재할당되어 사용된다.
    }
}
