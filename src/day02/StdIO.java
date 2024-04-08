package day02;

import java.io.IOException; //System.in.read();
import java.util.Scanner; //Scanner 사용시 외부 라이브러리 가져와

public class StdIO {
    public static void main(String[] args) throws IOException {

//        System.out.print("강아지"); // 줄바꿈 없이 출력
//        System.out.println("고양이"); // 줄바꿈 O
//
//        String name = "박수순";
//        int age = 5;
//        // %s : 문자열 포맷팅, %d : 정수, %f : 실수, %c : 단일문자
//        System.out.printf("%s의 강아지 %d살\n", name, age);
//        System.out.printf("%s의 강아지 %d살", name, age);

        // 자바에서 키보드 입력받기
        Scanner scan = new Scanner(System.in); // 입력준비 딱 1회만 하면 됨.
        // 문자 입력 받기
        System.out.print("이름 : ");
        String userName = scan.nextLine();
        System.out.println("userName = " + userName);

        // 정수 입력 받기 - 문자를 입력 받은 뒤 정수로 변환 Integer.parseInt(scan.nextLine())
        System.out.print("출생년도 : ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);
//        int read = System.in.read();
//        System.out.println("read = " + read);
    }
}
