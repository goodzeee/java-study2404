package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // ctrl + alt + t = 예외처리 문법
        try {   // 예외 오류가 발생할 부분 미리 예측하여 처리 !
            System.out.print("정수 1 : ");
            int n1 = Integer.parseInt(sc.next());   // NumberFormatException 예외가 발생할 수도 아닐 수도 있는 코드란 소리

            System.out.print("정수 2 : ");
            int n2 = sc.nextInt();    // InputMismatchException

            int result = n1 / n2;   // ArithmeticException

            String s = "hello";
            s.equals("hello");

            System.out.println("result = " + result);
        } catch (InputMismatchException e) {    // Exception 부모 클래스 어떤 예외도 캐치될 시 처리해줄게 ! => 따라서 해당 문제 클래스 가져와서 다루기
            System.out.println("정수를 제대로 입력하세요 !!!!");
        } catch (NumberFormatException e) {
            System.out.println("문자로 변환할 수 없는 정수입니다 !!!!");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다 !!!!");
            e.printStackTrace();  // 에러 로그를 띄움 - 개발시 유용
        } catch (Exception e) {   // Exception 가장 부모 클래스라 맨마지막에 넣기 !
            System.out.println("알 수 없는 에러입니다.");
        }

        System.out.println("프로그램 정상 종료 !");
    }
}
