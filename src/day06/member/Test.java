package day06.member;

public class Test {

    public static void main(String[] args) {

        Member[] memberArr = new Member[5]; // Member타입 배열 만들기

        Member m1 = new Member("mozzi@naver.com", "1234", "강길동", "여성", 20);
        Member m2 = new Member("susuni@naver.com", "5678", "박수순", "여성", 26);

        memberArr[0] = m1;
        memberArr[1] = m2;
        memberArr[2] = new Member("ad", "bc", "최태풍", "남성", 31);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        Member[] members = {m1, m2}; // Member 타입에 members 배열 안에 객체 2개
    }
    }