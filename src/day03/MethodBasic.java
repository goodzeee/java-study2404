package day03;

import java.util.Scanner;

public class MethodBasic {

    // 자바의 함수는 반드시 클래스 블록 내부, 다른 함수 외부에 만들어야 함.
    // 리턴되는 데이터 타입을 함수자리에 적어준다 !!
    // 두 개의 정수를 전달 받아 합을 리턴하는 함수
    static int add(int n1, int n2) {
        return n1 + n2;                // ctrl+alt+v or n / alt + enter
        // 밑에다 적어도 효력 없음.
    }

    // return이 없는 함수는 데이터 타입 대신 void 적기 !!
    static void multiply(int n1, int n2) {
        if (n1 > 100) return;  // 이렇게 return 사용시 함수 탈출 용도로 !!
        System.out.printf("%d x %d = %d\n", n1, n2, n1*n2);
    }

    // n개의 정수를 전달 받아 그 총합을 반환하는 함수
    static int addAll(int... numbers) {   // return 되는 데이터 타입 int !!
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1, int n2) {
        return new int[]{add(n1, n2), n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {

        // 함수를 호출할 때는 함수 안에서만 가능
        int r1 = add(10, 20);
        System.out.println("r1 = " + r1);

        // void 함순느 함수의 결과를 변수에 담을 수 없음.
        // 반드시 아래처럼 단독 호출해서 사용 !!
        multiply(5, 7);

        int r2 = addAll(new int[]{1, 3, 5, 7, 9});  // new int[] -> 변수에 집어넣을 때만 생략 가능
        System.out.println("r2 = " + r2);

        int r3 = addAll(10, 20, 30, 40); // 이렇게 담으려면 함수 생성할 때 ... 적어주기
        System.out.println("r3 = " + r3);

        int[] operateResult = operate(20, 10);
        System.out.println("곱셈결과 = " + operateResult[2]);

        Math.random();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
    } // end main method

} // end class
