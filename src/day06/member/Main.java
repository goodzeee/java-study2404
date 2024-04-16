package day06.member;

import util.SimpleInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        SimpleInput si = new SimpleInput(); // Scanner 만든 클래스 타입으로 생성

        // 회원정보를 입력받아서 회원 배열에 저장 -> 입출력과 저장소로 나눠서 관리 @@
        Member[] members = {};

        String email = si.input("-이메일 : ");
        String name = si.input("-이름 : ");
        String password = si.input("-비밀번호 : ");
        String gender = si.input("-성별 : ");
        int age = Integer.parseInt(si.input("-나이 : "));

        // 입력 데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);

        // 생성된 객체를 회원 배열에 저장

    }
}
