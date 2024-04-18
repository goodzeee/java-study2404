package day07.player;

import java.util.Scanner;

// 상위 클래스(super class)
// 공통 필드와 메서드를 가진 부모 클래스 !
// @@상위 클래스에도 가장 상위인 Object 를 자동상속 받고 있다.@@
public class Player extends Object {

    // 공통 필드 & 메서드 담기
    String nickname;
    int level;
    int hp;

    // 부모 클래스 생성자 생성
     Player(String nickname) {
         this.nickname = nickname;
         this.level = 1;
         this.hp = 50;
     }

    // 현재 캐릭터 정보 출력 메서드
    public void showStatus() {
        System.out.println("\n==========Character's Info============");
        System.out.println("#name : " + this.nickname);
        System.out.println("#level : " + this.level);
        System.out.println("#hp : " + this.hp);
    }
}
