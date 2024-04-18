package day07.player;

// Mage 클래스에 2차 전직 상속 받기
public class HighMage extends Mage{

    // Mage 클래스 생성자 파라미터 똑같이 가져오기
    HighMage(String nickname) {
        super(nickname);
    }

}
