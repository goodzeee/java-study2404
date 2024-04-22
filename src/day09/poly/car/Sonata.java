package day09.poly.car;

// Car 부모 클래스 타입을 가져와 객체생성으로 사용할 수 있게 됨.
public class Sonata extends Car {

    @Override
    public void accelerate() {
        System.out.println("소나타가 부릉부릉");
    }

    // 소나타 동호회에 가입하는 기능
    public void joinSonataClub() {

    }
}
