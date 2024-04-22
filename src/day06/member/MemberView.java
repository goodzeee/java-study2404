package day06.member;

import util.SimpleInput;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    // 객체의 협력 (필드) : 객체를 표현하는 데이터
    MemberRepository mr;
    SimpleInput si;

    // 생성자 : 객체가 생성될 때 초기값 세팅
    // 생성자 함수 = 클래스명
    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }

    // 메서드 : 객체가 할 수 있는 일, 행위
    // 3번
    void showMembers() {
        System.out.printf("========= 현재 회원 목록 (총 %d명) ==========\n", mr.members.size());
        for (Member m : mr.members.getMembers()) {
            System.out.println(m);
        }
    }

    // 1번 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;
        while (true) {
            email = si.input("- 이메일: ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일입니다.");
        }

        String name = si.input("- 이름: ");
        String password = si.input("- 패스워드: ");
        String gender = si.input("- 성별: ");

        // 성별 상수로 처리한 것 !
        if (gender.equals("M")) {
            gender = MemberConstants.MALE;
        } else if (gender.equals("F")) {
            gender = MemberConstants.FEMALE;
        }

        // 예외 처리하기
        int age = 0;
        while (true) {
            try {
                age = Integer.parseInt(si.input("- 나이: "));
                break;
            } catch (NumberFormatException e) {
                System.out.println("나이는 숫자로 입력하세요 !!");
            }
        }

        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);

        // 위임 - 관심사의 분리
        mr.addNewMember(newMember);
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 탈퇴하기");
        // 탈퇴할 때 해당 회원정보 restoreList에 저장해둔거 복구 !
        System.out.println("* 6. 회원 복구하기");
        System.out.println("* 7. 프로그램 종료");
        System.out.println("=============================");

        String menuNumber = si.input("- 메뉴 번호: ");
        return menuNumber;
    }

    // 6번 프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y/n]\n>> ");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        } else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }

    // 2번 이메일 입력받고 찾은 회원정보를 출력
    public void getMember() {
        String inputEmail = si.input("# 조회하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember != null) {
            System.out.println("============= 조회 결과 ============");
            System.out.println("# 이름: " + foundMember.memberName);
            System.out.println("# 비밀번호: " + foundMember.password);
            System.out.println("# 성별: " + foundMember.gender);
            System.out.println("# 나이: " + foundMember.age);
            System.out.println();
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
        }
    }

    // 4번 수정 대상의 이메일을 입력받고 조회에 성공하면 패스워드를 수정
    public void updatePassword() {
        String inputEmail = si.input("# 수정하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember != null) {

            // 기존 비밀번호를 입력해주세요

            // 비번 수정
            System.out.printf("# %s님의 비밀번호를 변경합니다.\n", foundMember.memberName);
            String newPassword = si.input("# 새 비밀번호: ");

            // 회원정보 실제로 수정
//            foundMember.password = newPassword;
            foundMember.changePassword(newPassword);

            System.out.println("# 비밀번호 변경이 완료되었습니다.");
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
        }
    }

    public void deleteMember() {
        String inputEmail = si.input("# 삭제하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 있는지 조회
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember != null) {
            // 삭제 진행
            // 패스워드 검사
            String inputPw = si.input("# 비밀번호를 입력: ");
            if (inputPw.equals(foundMember.password)) {
                mr.removeMember(inputEmail);
                System.out.printf("# %s님의 회원정보가 삭제되었습니다.\n", foundMember.memberName);
            } else {
                System.out.println("\n# 비밀번호가 일치하지 않습니다. 탈퇴를 취소합니다.");
            }
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
        }

    }

    // 6번 회원 복구에 관련한 입출력 처리
    public void restoreMember() {
        String inputEmail = si.input("# 복구하실 회원의 이메일을 입력하세요.\n>> ");

        // 이메일이 일치하는 회원이 복구 리스트에 있는지 조회
        Member foundMember = mr.findRestoreMemberByEmail(inputEmail);

        if (foundMember != null) {
            // 패스워드 검사
            String inputPw = si.input("# 비밀번호를 입력: ");
            if (inputPw.equals(foundMember.password)) {
                mr.restore(inputEmail);
                System.out.printf("# %s님의 회원정보가 복구되었습니다.\n", foundMember.memberName);
            } else {
                System.out.println("\n# 비밀번호가 일치하지 않습니다. 복구를 취소합니다.");
            }
        } else {
            System.out.println("\n# 해당 회원은 복구대상이 아닙니다.");
        }
    }
}
