package j10_배열;

public class Array2 {
    public static void main(String[] args) {
        String[] names = new String[5];
        // new String[숫자] : 배열의 크기가 숫자만큼 된다.
        names[0] = "임지현";
        names[1] = "신경수";
        names[2] = "고희주";
        names[3] = "문승주";
        names[4] = "장건녕";

        for(int i=0; i < names.length; i++) {
            System.out.println("이름" + (i+1) + " : " + names[i]);
        }
    }
}
