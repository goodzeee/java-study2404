package day08.super_;

// 상위 클래스
public class Parent {

    // 필드 : 객체의 속성 - 성질, 데이터, 명사
    int a;
    double b;

    // 생성자 : 객체가 생성될 때 초기값 세팅 , 클래스명과 동일
    Parent() {
        super(); // Parent 상위 클래스 = Object !!
        System.out.println("Parent 클래스 생성자 호출");
        this.a = 15;
        this.b = 20.5;
    }

    // 메서드 : 객체의 기능
    void superMethod() {
        System.out.println("parent a = " + this.a);
        System.out.println("parent b = " + this.b);
    }
}
