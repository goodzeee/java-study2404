package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {


    // 정수를 입력받아 리턴하는 메서드
    // throws + 예외타입 => 에러날 수도 있어 너한테 던질거야 호출부에서 예외처리해서 써라
    public int inputNum() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            return num;
    }

    // 문자열을 정수로 변환하는 메서드
    public int convert(String str) throws NumberFormatException {

            int n = Integer.parseInt(str);
            return n;
    }
}
