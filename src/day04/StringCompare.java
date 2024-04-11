package day04;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputName = scan.nextLine();
        String myName = new String("강길동");

        char[] nickName = {'독', '서'};
        String nick = new String(nickName);
        System.out.println("nick = " + nick);

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        // 문자열 같은지 보기 위해선 == (X) , equals로 비교하여 본다 !
        if (myName.equals(inputName)) {
            System.out.println("두 문자열이 같다 !");
        } else {
            System.out.println("두 문자열이 다르다 !");
        }
    }
}
