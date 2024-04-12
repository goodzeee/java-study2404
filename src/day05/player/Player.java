package day05.player;

public class Player {
    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자는 생성자 내부에서 또 다른 생성자를 호출할 수 있다.
    public Player() {
        // 다른 생성자 불러오기 생성자당 1번씩만 가능
        // 첫 줄에 this(파라미터); 써야 함.
        this("이름 없는 캐릭터", 1, 100);
        System.out.println("1번 생성자 호출");
    }

    // 생성자 : 객체가 만들어질 때 초기에 어떤 값을 가질지를 정하는 곳
    Player(String nickName) {
        this(nickName, 1, 100);
        System.out.println("2번 생성자 호출");
//        // 필드명을 지역 변수에 가져와서 사용 가능 this라는 나를 추가해서 !
//        this.nickName = nickName; // 사용자가 이름 지정 나머지는 초기값 !
//        this.level = 1;
//        this.hp = 100;
    }

    public Player(String nickName, int level) {
        this(nickName, level, 1000);
        System.out.println("3번 생성자 호출");
//        this.nickName = nickName;
//        this.level = level;
//        this.hp = 1000;
    }

    public Player(String nickName, int level, int hp) {
        // 모든 지역 변수가 커스텀되는 생성자를 사용하기 !
        System.out.println("4번 생성자 호출");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    void info (Player this) {

    }

    // 메서드 Player target -> 맞은 플레이어
        void attack(Player this, Player target) {

        System.out.println("this = " + this);
        System.out.println("target = " + target);

        // 맞은 player의 체력을 10 감소시킬 것임.
        target.hp -= 10;

        // 때린 내 player의 체력을 3 감소시킴. this = 나 자신을 가르킴
        this.hp -= 3;

        System.out.printf("%s님이 %s님을 공격했습니다.\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
    }
}
