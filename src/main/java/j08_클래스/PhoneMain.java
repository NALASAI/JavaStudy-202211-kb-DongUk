package j08_클래스;

public class PhoneMain {
    public static void main(String[] args) {

        // new 메모리 할당
        Phone iPhone14 = new Phone();
        Phone galaxyS22 = new Phone("SAMSUNG", "galaxyS22");
        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "APPLE";
        iPhone14.model = "iphone14";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();
        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();
    }
}
