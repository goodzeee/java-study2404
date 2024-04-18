package day07.player;

public class Main {
    public static void main(String[] args) {

        /*

         */

        Warrior w = new Warrior("모찌인데오");
        Mage m = new Mage("주작입니다");
        Hunter h = new Hunter("두과자");
        HighMage hm = new HighMage("풋팟퐁커리");

        // showStatus = 공통 기능
        w.showStatus();
        //w.dash(); 각 클래스에 작성한 각자 기능
        m.showStatus();
        h.showStatus();
        hm.showStatus();
    }
}
