package util;

import java.util.Scanner;

// 역할 : 스캐너 입력을 간소회해주는 객체
public class SimpleInput {

    Scanner scan = new Scanner(System.in);

    // 문자열 입력을 처리
    public String input(String message) {
        System.out.print(message);
        return scan.nextLine();
    }
}
