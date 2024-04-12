package day05.player;

public class Main {
    public static void main(String[] args) {

        Player mozzi = new Player("모찌에오");
        Player jujak = new Player("주작입니다");

        System.out.println("mozzi = " + mozzi);
        System.out.println("jujak = " + jujak);

        // jujak이 맞은 얘 = attack 메소드에 target이다 !
        // mozzi는 때린 얘 = attack 메소드에서 나 this !
        mozzi.attack(jujak);
        jujak.attack(mozzi);
        mozzi.attack(jujak);
        mozzi.attack(jujak);

        Player p1 = new Player("두과자");
    }
}
