package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;

        System.out.println("나눗셈 시작 !");
        // 빨간 오류선 없는데 오류가 출력돼 ==> 예외 발생 (비정상 종료됨)
        // 프로그래머가 사전에 오류를 예측하여 예방할 수 있는 ==> 예외 처리

        // 예외 처리 문법 = try{ } catch() { }
        try {
            int result = n1 / n2;  // 예외 발생 가능성 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) {
            // 예외가 발생했을 경우 프로그램이 튕기는 대신 실행할 코드 (예외시 비정상 종료 막아줌)
            System.out.println("0으로 나누면 안됩니다 ~");
        }

        System.out.println("나눗셈 정상 종료 !");
    }
}
