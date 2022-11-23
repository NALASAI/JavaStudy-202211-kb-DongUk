package j13_Object;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor  // Argument 는 매개변수란 의미이며 매개변수가 없다는 의미가 된다. -> 기본생성자
@AllArgsConstructor // 모든 변수들이 있다. | 전체생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class Entity {
    private String name;
    private int age;
    private String address;

    public boolean cmp(){
        return this.getClass() == Entity.class;
    }
}