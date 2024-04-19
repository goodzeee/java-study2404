package day09.poly;

import java.util.concurrent.Callable;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    void test() {

        // 다형성 : 객체가 여러 타입을 사용할 수 있다. (상속을 전제 조건 )
        // - 상속관계인 부모의 타입 사용 가능 !
        A x1 = new A();
        A x2 = new B();  // B, C 모두 A 부모를 상속 받아서 A 사용 가능 !!
        A x3 = new C();

        B x4 = new D();  // 해당 객체의 상속 받은 부모라인이면 다 사용할 수 있다 !!
        C x5 = new E();

        int a = 10;
        double b = (double) a;
        // 객체타입의 클래스타입의 형변환
        C c = new C();
        A d = (A) c;

    }
}
