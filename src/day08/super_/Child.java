package day08.super_;

// 하위 클래스
public class Child extends Parent {

    //int a; // 부모 - 자식 서로 같은 필드를
    //double b;
    boolean c;

    Child() {
        //super(); // 생성자의 첫 줄이 비어있을 때 부모 클래스 생성자 호출이 자동으로 들어감
        this(100);
        System.out.println("Child 클래스의 생성자 호출");
        this.c = true;
    }
    // this : 자기 자신 / super : 상위 부모 클래스 생성자
    Child(int x) {
        super(); // 부모 클래스 생성자 자동 호출 !
        System.out.println("Child 클래스의 2번째 생성자 호출");
    }

    void childMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}
