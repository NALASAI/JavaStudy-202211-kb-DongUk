package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj){
        return obj;
    }

    public static void main(String[] args) {
        Object[] objects = new Object[7];

        objects[0] = new Student(20220001, "강동욱");
        objects[1] = new Car("쏘나타", "화이트");
        objects[2] = new Student(20220002, "홍길동");
        objects[3] = new Car("K9", "블랙");
        objects[4] = new Student(20220003, "감나무");
        objects[5] = "강동욱";
        objects[6] = 20220004;

        for(int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        System.out.println(objects[5].getClass());
        System.out.println(objects[6].getClass());

    }
}
