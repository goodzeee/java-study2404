package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;

// 클래스 앞에는 public, default만 사용 가능 !
// default 로 사용 시 다른 패키지인 C 클래스에 접근 못함.
public class B {

    // 필드, 생성자, 메서드에는 4개 제한자 모두 사용 가능 !
    void test() {

        A a1 = new A(50); // public 가능
        A a2 = new A(5.5); // default (같은 패키지 맞지 ?)
        //new A(false); // private 불가능

        a1.f1 = 20;
        a2.f2 = 40;
        //a2.f3 = 40; 다른 클래스에서 사용 안됨 private

        a1.m1();
        a2.m2();
        //a1.m3(); private

        C c = new C();
        c.y1 = 10;  // 다른 패키지에서 public 붙은 필드만 사용 가능 !!
        //c.y2 = 11;
        //c.y3 = 30;


    }
}
