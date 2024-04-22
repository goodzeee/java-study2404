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

        System.out.println("====================================");
        // 썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다.
        // 1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다.
        // 2. 타겟이 된 대상은 10 ~ 15의 랜덤 피해를 입고 실제로 체력이 감소한다.
        m.thunderBolt(w, h, m, new Mage("포카칩500원"), new Warrior("딸기가조아"));
        System.out.printf("%s님이 ");
    }
}
