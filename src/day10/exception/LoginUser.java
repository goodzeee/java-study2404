package day10.exception;

public class LoginUser {

    private String account;
    private String password;

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    // 로그인상태 상수 만들기
    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증로직  (맨 끝에 throws + 예외 타입 넣기)
    public LoginStatus loginValidate(String inputAccount, String inputPassword) throws InvalidLoginInputException {

        // 아이디가 일치하는가 ?
        if (!inputAccount.equals(account)) {
            // 출력문과 리턴으로 단순 문제를 알려주는 것보다 throw 예외처리 사용 !
            //System.out.println("계정이 일치하지 않습니다.");
            //return LoginStatus.ID_FAIL;
            throw new InvalidLoginInputException("계정이 일치하지 않습니다.");
        }
        // 비밀번호가 일치하는가 ?
        if (!inputPassword.equals(password)) {

            throw new InvalidLoginInputException("비밀번호가 일치하지 않습니다.");
        }

        throw new InvalidLoginInputException("로그인에 성공했습니다.");
    }
}
