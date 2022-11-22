package j11_상속.동물;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println();
        System.out.println("[업캐스팅]");
        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }

        System.out.println();
        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Human){
                ((Human) animals[i]).readBooks();
                // () 를 생성해 묶어놓지 않을 경우 animals 에 있는 readBooks()에 먼저 접근하는데
                // animals 에는 readBooks() 가 없으므로 실행되지 않는다
            }else if(animals[i] instanceof Tiger){
                ((Tiger) animals[i]).hunting();
            }else{
                System.out.println("다운 캐스팅 불가");
            }
        }
        // instanceof : 객체 타입을 확인하는 연산자
        // 형변환 가능 여부를 확인하며 true / false 로 결과를 반환
        // 주로 상속 관계에서 부모객체인지 자식 객체인지 확인하는 데 사용
    }
}
