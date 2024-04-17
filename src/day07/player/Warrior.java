package day07.player;

// 하위 클래스 (sub class)
// 부모 클래스인 Player 공통 필드와 메서드 상속 받는 클래스 !!
public class Warrior extends Player {
    // 필드
//    String nickname;
//    int level;
//    int hp;
    int rage;  // 분노 게이지

    // 생성자
    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

//    // 현재 캐릭터 정보 출력 메서드
//    public void showStatus() {
//        System.out.println("\n==========Character's Info============");
//        System.out.println("#name : " + this.nickname);
//        System.out.println("#level : " + this.level);
//        System.out.println("#hp : " + this.hp);
//    }

    public void dash(Warrior target) {
        System.out.println("dash 스킬이 필요합니다.");
    }
}
