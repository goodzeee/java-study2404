package day07.encapsulation;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("벤츠 e 클래스");

        // 불러와서 사용하지 못하도록 나머지 메서드 private 으로 접근 제한 둠 !!
        myCar.startStop();

        // myCar.start = false; 다른 방법으로 시동 컨트롤 안됨.

        // 속도 0~200km 로만 제한 - 범위 처리 : setter 사용 ! 처리한 속도갑 가져오기 getter !
        myCar.setSpeed(90);
        System.out.println("현재 속도 : " + myCar.getSpeed() + "km");

        // 변속 모드
        myCar.setMode('p');
        System.out.println("현재 변속 모드 : " + myCar.getMode());
    }
}
