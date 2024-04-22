package day10.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNum();
//        System.out.println("n = " + n);

        // 호출부로 예외처리 떠넘기기 try - catch
//        try {
//            int n2 = te.convert("100");
//            System.out.println("n2 = " +  n2 * 20);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }

        LoginUser user = new LoginUser("abc1234", "1234");

        try {
            user.loginValidate("abc1234", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }
    }
}
