package day06.member;

import util.SimpleInput;

// 역할 : 회원 데이터 관리를 위해 입출력 담당
public class MemberView {

    // 객체의 협력 (필드)
    MemberRepository mr; // 배열 저장소에 만들어논 배열이 필요해서 협력하기 !!
    SimpleInput si;

    // 생성자
    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }


    // 메서드
    void showMembers() {
        System.out.printf("===================현재 회원 목록 (총 %d명)===================\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }

    // 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = si.input("-이메일 : ");
        String name = si.input("-이름 : ");
        String password = si.input("-비밀번호 : ");
        String gender = si.input("-성별 : ");
        int age = Integer.parseInt(si.input("-나이 : "));

        // 입력 데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);
        // 배열 데이터 저장소 클래스에 위임 - 관심사의 분리 !
        mr.addNewMember(newMember);
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 프로그램 종료");
        System.out.println("======================================");
        // 입력까지 처리 !
        String menuNumber = si.input("- 메뉴 번호 : ");
        return menuNumber; // while 무한루프로 되어 있어서 return으로 끝내주기 !
    }
}
