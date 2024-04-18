package day08.static_;

public class Count {

    // 필드 : 제한자 & static 둘 다 사용 가능 !!
    // 사용 제한자
    static int x;  // 정적 필드 : 모든 객체가 공유
    int y;     // 인스턴스 필드 : 각 객체별로 따로 관리

    // static 정적 메서드 : 모든 객체가 공유하며 객체 생성없이 접근 가능
    static void m1() {
        System.out.println("static method call");
        System.out.println("x (static) = " + x);

        // static 메서드 내부 => 인스턴스 필드를 직접 참조할 수 없다.
        // static 은 객체생성 없이 호출되므로 this 를 가질 수 없기 때문
        // System.out.println("y (instance) = " + this.y);
    }

    // 인스턴스 메서드 : 각 객체별로 따로 실행됨
    void m2() {
        System.out.println("instance method call");
        System.out.println("x (static) = " + this.x); // 인스턴스 메서드 => 객체생성에 따라 this 자기 자신이 필요
        System.out.println("y (instance) = " + this.y);
    }
}
