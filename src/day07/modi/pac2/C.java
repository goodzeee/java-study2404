package day07.modi.pac2;

import day07.modi.pac1.A;

public class C {

    public int y1;
    int y2;
    private int y3;

    void test() {

        A a = new A(100); // A에 public 생성자
        //new A(3.14);  // A에 default 부터
        //new A(true); // private 사용 못함 - 둘 다 다른 패키지에서 사용 못함 !!

        a.f1 = 20;
        //a.f2 = 40;
        //a.f3 = 40; 다른 패키지에서 사용 안됨 = default, private

        a.m1();
        //a.m2();
        //a.m3(); private
    }
}
