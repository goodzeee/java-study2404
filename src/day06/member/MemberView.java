package day06.member;

import util.SimpleInput;

import static day06.member.MemberRepository.members;

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
    // 3. 전체회원 정보 조회하기
    void showMembers() {
        System.out.printf("===================현재 회원 목록 (총 %d명)===================\n", members.length);
        for (Member m : members) {
            System.out.println(m);
        }
    }

    // 1. 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;
        while (true) {
            email = si.input("-이메일 : ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일 입니다 !");
        }

        String name = si.input("-이름 : ");
        String password = si.input("-비밀번호 : ");
        String gender = si.input("-성별 : ");
        int age = Integer.parseInt(si.input("-나이 : "));

        // 입력 데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);
        // 배열 데이터 저장소 클래스에 위임 - 관심사의 분리 !
        mr.addNewMember(newMember);
    }

    // 2. 회원 이메일을 입력 받아 회원 정보 출력하기
    public void getMember() {
        System.out.println("# 조회를 시작합니다.");
        String inputEmail = si.input("-이메일 : ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member findMember = mr.findMemberEmail(inputEmail);

        if(findMember != null) {
            System.out.println("==================조회 결과====================");
            System.out.println("#이름 : " + findMember.memberName);
            System.out.println("#비밀번호 : " + findMember.password);
            System.out.println("#성별 : " + findMember.gender);
            System.out.println("#나이 : " + findMember.age);
        } else {
            System.out.println("\n조회한 회원은 존재하지 않습니다.");
        }
    }

    // 4. 수정할 이메일을 입력 받아 비밀번호 변경하기
    public void updateMember() {
        String inputEmail = si.input("# 수정할 이메일 : ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member findMember = mr.findMemberEmail(inputEmail);

        if(findMember != null) {
           System.out.printf("%s님의 비밀번호를 변경합니다." , findMember.memberName);
           String newPw = si.input(" # 새로운 비밀번호 : ");
           findMember.password = newPw;
            System.out.println("\n 비밀번호 변경이 완료되었습니다.");
      } else {
            System.out.println("\n존재하지 않는 회원 입니다.");
        }
    }

    // 5. 탈퇴시킬 회원의 비밀번호를 입력받아 맞을 시 회원정보 삭제
    public void removerMember() {
        String remove = si.input("# 탈퇴할 이메일 : ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member finderMember = mr.findMemberEmail(remove);

        if (finderMember != null) {
            // 삭제 진행 - 비밀번호 일치한지 검사
            String removePw = si.input("탈퇴할 비밀번호를 입력 : ");
            if (removePw.equals(finderMember.password)) {

            } else {
                System.out.println("\n입력하신 비밀번호는 존재하지 않습니다.");
            }
        } else {
            System.out.println("\n존재하지 않는 회원 입니다.");
        }
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 탈퇴하기");
        System.out.println("* 6. 프로그램 종료");
        System.out.println("======================================");
        // 입력까지 처리 !
        String menuNumber = si.input("- 메뉴 번호 : ");
        return menuNumber; // while 무한루프로 되어 있어서 return으로 끝내주기 !
    }
}
