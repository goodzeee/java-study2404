package day07.encapsulation.pracrtice;

import day06.member.Member;
import util.SimpleInput;

public class PasswordManager {
    // 사용자 비밀번호 필드
    private String password;

    // 생성자
    public PasswordManager(String Password) {
        this.password = Password;
    }

    // 비밀번호 변경 가능한 기능 메서드
    public boolean changePassword(String oldPassword, String newPassword) {

        // 현재 비밀번호 입력 받기
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        } else {
            System.out.println("\n# 해당 회원은 존재하지 않습니다.");
            return false;
        }
    }
}


