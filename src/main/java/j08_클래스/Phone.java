package j08_클래스;

public class Phone {

    String model;
    String company;

    Phone(){}

    Phone(String c, String m){
        company = c;
        model = m;
    }

    void printPhoneCompany(){
        System.out.println("제조사 : " + company);
        System.out.println();
    }

    void printPhoneModel(){
        System.out.println("모델명 : " + model);
        System.out.println();
    }
}
