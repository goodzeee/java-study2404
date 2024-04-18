package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A{

    D() {
        //super();  // 부모 A 클래스의 public 사용 가능.
        //super(5.5); // 부모 A 클래스이 default 사용 못함.
        super(100); // 상속 받은 A 클래스의 protected 사용 가능.

        super.f1 = 100;  // protected
        //super.f2 = 10; // xxx

        m1();   // protected
    }

    // 상속을 통해서만 접근 허용하게 해주는 protected !!
    void test() {
        A a = new A();  // public 생성자

        f1 = 10; // f2 = 30;
        m1();
    }
}
