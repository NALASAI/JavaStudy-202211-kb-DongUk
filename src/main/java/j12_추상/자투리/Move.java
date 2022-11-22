package j12_추상.자투리;

public class Move implements Movement{
    @Override
    public String Up(String msg){
        System.out.println(msg + "님이 위로한칸 이동하셨습니다.");
        return msg;
    }

    @Override
    public String Down(String msg) {
        System.out.println(msg + "님이 아래로한칸 이동하셨습니다.");
        return msg;
    }

    @Override
    public String Left(String msg) {
        System.out.println(msg + "님이 왼쪽으로한칸 이동하셨습니다.");
        return msg;
    }

    @Override
    public String Right(String msg) {
        System.out.println(msg + "님이 오른쪽으로한칸 이동하셨습니다.");
        return msg;
    }
}
