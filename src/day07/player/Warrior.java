package day07.player;

// 하위 클래스 (sub class)
// 부모 클래스인 Player 공통 필드와 메서드 상속 받는 클래스 !!
public class Warrior extends Player {

//    String nickname;
//    int level;
//    int hp;
    int rage;  // 분노 게이지

    // 생성자
    public Warrior(String nickname) {
//        this.nickname = nickname;
//        this.level = 1;
//        this.hp = 50;  // 상위 클래스 생성자에 존재하니 super(파라미터); 로 주기 !
        super(nickname);
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

    // 오버라이딩 : 부모가 물려준 메서드를 고쳐 쓰는 것.
    // 규칙 - 부모가 물려준 형태 유지할 것(접근제한, 리턴타입, 이름, 파라미터..)
    //       접근 제한자는 부모보다 more public 할 것 !
    public void showStatus() {
//        System.out.println("\n==========Character's Info============");
//        System.out.println("#name : " + this.nickname);
//        System.out.println("#level : " + this.level);
//        System.out.println("#hp : " + this.hp);

        // 부모가 물려준 showStatus 메서드
        super.showStatus();  // 나머지 출력 담고 있음.
        System.out.println("#rage : " + this.rage);
    }
}
