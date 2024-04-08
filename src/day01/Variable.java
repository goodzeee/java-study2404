package day01; // 폴더 이름 냄겨둬잉

public class Variable { // 파일명이 클래스명으로 오며 대문자로
    public static void main(String[] args) {

        int score = 78; //int : 정수 타입
        String userName = "강길동"; //String : " 문자열 " 타입
        int phoneNumber; //낙타 표기법으로 사용하기

        // 변수의 스코프 - 블록레벨 스코프
        // 자바의 변수는 생성된 블록이 종료되면 메모리에서 사라짐
        int i = 100;
        for (int j = 0; j < 5; j++) {
            System.out.println(j); // for문안에 i로 재선언 불가
        } // end for

        // 변수는 마무리된 블록을 떠나면 메모리 사라져서 사용 못함.
        int n1 = 10;
        int n2; // 블록 밖에다 변수 선언해두면 어디서든 사용 가능

        if (true) {
            System.out.println(n1);
            n2 = 20;

            while (true) {
                System.out.println(n2);
                int n3 = 30;
                break;
            } // end while
        } // end if
        System.out.println(n2); // 사용 못함
    } // end main
} // end class
