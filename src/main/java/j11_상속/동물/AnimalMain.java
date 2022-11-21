package j11_상속.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

//        animal.move();
//        human.move();
//        tiger.move();

//        human.readBooks();
//        tiger.hunting();

        int a = (int) 3.14;     // 다운캐스팅
        double d = (double) 3;  // 업캐스팅
        
        // 업캐스팅, 다운캐스팅
        Animal hAnimal = human; // 업캐스팅 | hAnimal에는 부모 클래스의 주소가 저장된다.
        Animal tAnimal = tiger; // (부모객체) 없이 묵언으로 업캐스팅이 가능하다.
        Animal[] animals = new Animal[3];

        animals[0] = new Human(); // 생성 후 바로 저장 가능
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for(int i = 0; i < animals.length; i++){
            animals[i].move();  // 업캐스팅이 되었더라도 오버라이딩한 요소가 있으면 해당 요소가 실행이 된다.
        }

        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Human){    // 해당 요소의 원래 자료형이 Human일때 출력
                Human h = (Human) animals[i];   // 다운캐스팅은 명시적형 변환을 사용해야 한다.
                h.readBooks();
            }else if(animals[i] instanceof Tiger){
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else{
                System.out.println("다운 캐스팅 불가");
            }
        }


    }
}
