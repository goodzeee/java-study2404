package day06.member;

import util.SimpleInput;

// 역할 : 사용자의 메뉴 입력을 분기하는 역할
public class MemberController {

    MemberView mv;
    SimpleInput si;

    MemberController() {
        this.mv = new MemberView();
        this.si = new SimpleInput();
    }

    // 메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {

        while (true) {
            String menuNum = mv.showProgramMenu();

            switch (menuNum) {
                case "1":
                    mv.inputNewMember();
                    break;
                case "2":
                    mv.getMember();
                    break;
                case "3":
                    mv.showMembers();
                    break;
                case "4":
                    mv.updateMember();
                    break;
                case "5":
                    mv.removerMember();
                    break;
                case "6":
                    System.out.println("프로그램을 종료합니다!");
                    return;
            }

            si.stopInput(); // 엔터 기능
        }
    }
}
