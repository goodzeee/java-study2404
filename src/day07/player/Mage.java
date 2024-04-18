package day07.player;

public class Mage extends Player {

//    String nickname;
//    int level;
//    int hp;
    int mana;

    // 생성자
    public Mage(String nickname) {
//        this.nickname = nickname;
//        this.level = 1;
//        this.hp = 50;
        super(nickname);
        this.mana = 100;
    }

//    // 현재 캐릭터 정보 출력 메서드
//    public void showStatus() {
//        System.out.println("\n==========Character's Info============");
//        System.out.println("#name : " + this.nickname);
//        System.out.println("#level : " + this.level);
//        System.out.println("#hp : " + this.hp);
//    }

    @Override // 오버라이딩 규칙을 지켰는지 검증해주는 안전장치
    public void showStatus() {
        super.showStatus();
        System.out.println("#mana : " + this.mana);
    }

    public void thunderBolt(Mage...targets) {

    }
}
