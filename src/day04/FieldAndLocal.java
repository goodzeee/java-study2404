package day04;

public class FieldAndLocal {

    // 필드는 값을 초기화하지 않아도 각 타입의 기본값으로 자동 세팅
    double aaa; // 얘는 heap 넓은 공간에 살아서 데이터 값 주지 않아도 되는 여유로움

    // ccc : 매개변수(parameter) - 메서드 호출시 반드시 필요한 인자값 !
    void foo(int ccc) {
        int bbb = 20; // 얘는 stack 좁은 공간에 살아서 데이터 값 낭비하면 안됨.

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
