package day10.abs;

// abstract 추상 클래스 => 객체생성 필요 없어 ~~ 안됨
public abstract class Pet {
    // 같은 기능 추상화된 것 => 상속 받게 공통 부모 만들기 !!

    String name;
    int age;
    String kind;

    public Pet() {

    }

    // 밥 먹는 기능 부모 클래스에서 eat 으로 공통
    // 메서드명만 통일하게 해주기 => 구체적일 필요 없어 추상적임 !
    // 자식들에게 메서드명만 통일하고 각각 구체화해서 쓰게 해 ~
    // abstract 추상 메서드
    public abstract void eat();
    // 밥 먹고 잠 자는 기능은 필수적이니 강요 => 추상화 O
    public abstract void sleep();

    // 산책기능은 필요한 객체가 필요에 따라 오버라이딩하는 것이지 모든 자식에게 강요할 필요 없다 => 추상화 X
    public void walk() {
        System.out.println("산책은 무조건 공원에서만 하세요.");
    }
}
