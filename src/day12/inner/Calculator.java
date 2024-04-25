package day12.inner;

// 계산기 인터페이스 (껍데기만 만들어두고) -> 구체화 만들기]
@FunctionalInterface
public interface Calculator {

    // 계산 기능 명세 -> 오버라이딩할 메서드 1개 !
    int operate(int n1, int n2); // 정수 두 개 받아서 계산되게

}
