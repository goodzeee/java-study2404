package day09.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 100;
        child.p1 = 200; // Parent 상속 받았으니 필드 사용 가능 !

        child.method1(); // child 가 overriding 한 결과 나옴.
        child.method2();

        Parent parent = new Parent();
        parent.p1 = 300;
        parent.method1();  // parent 메소드 원본이 나옴.

        //Parent castingChild = new Child();  // 부모 타입으로 객체생성시 child 에 있는 필드 사용 못함.
        Child castingChild = new Child();
        castingChild.p1 = 50;
        castingChild.c1 = 80;
        castingChild.method1();
        castingChild.method2();

        // 부모 타입으로 사용시 이렇게 써 그냥 ~~
        Parent[] pArr = {castingChild};
        Parent pp = castingChild;
    }
}
