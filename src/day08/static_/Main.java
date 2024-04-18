package day08.static_;

public class Main {
    public static void main(String[] args) {


        // static 데이터는 객체생성 없이 접근 가능 !
        Count.x = 20; // 정적 필드
        Count.m1();  // 정적 메서드  --> 객체생성 없으니 정적은 this xx

        Count c1 = new Count();
        c1.m2();   // c1 => this 자기 자신을 가르키는 역할
        Count c2 = new Count();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

//        c2.x = 99; // static int x; -> 값을 여러 개 받지 않고 하나로 통일된 정적 !!
//        c1.x = 50;
        Count.x = 99; // 어차피 값 1개이니 클래스명으로 가져오기
        Count.x = 50;

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        System.out.println("c1.x = " + Count.x);
        System.out.println("c2.x = " + Count.x);
    }
}
