package day10.inter;

// 추상화  abstract = 인터페이스 interface 동일한 역할
public interface SmartPhone {
    // 인터페이스는 처음 설계부터 객체를 만들지 않을 것을 가정하여 생성자 및 필드 선언 불가능 / 상수 선언은 가능
    int AGE = 10; // = 상수임

    // 인터페이스는 기본적으로 추상화 상태이기 때문에 추상화 키워드 abstract 생략 가능 !
    // => 기본 메서드 못 만듬 ! all 추상 메서드

    // 스펙 보여주기 기능
    void information();

    // 충전 기능
    void charge();

    // 카메라 기능
    void camera();
}
