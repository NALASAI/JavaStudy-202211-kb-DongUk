package j13_Object;

public class EntityMain {
    public static void main(String[] args) {
        Entity entity = new Entity("강동욱", 27, "부산 가야진구 가야동");
        Entity entity2 = new Entity("강동욱", 27, "부산 가야진구 가야동");

        System.out.println(entity);
        System.out.println();

        System.out.println(entity.equals(entity2));
        System.out.println();

        System.out.println(entity.hashCode());
        System.out.println(entity2.hashCode());
        System.out.println();

        System.out.println(entity.getAddress());
        System.out.println();

        System.out.println(Entity.class);
        Class c = Entity.class;
        System.out.println();

        Object obj = new Student(20220001, "강동욱");

        System.out.println(Entity.class == entity.getClass());
        System.out.println(Entity.class.equals(obj.getClass()));
        System.out.println((obj instanceof Entity));
    }
}
