package day06.member;

// 역할 : 회원 배열을 관리하는 역할 (회원 배열 데이터 저장소)
public class MemberRepository {

    // 필드 (빈 배열 저장소)
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("zzang@naver.com", "1234", "짜장이", "남성", 32);
        members[1] = new Member("pororo@naver.com", "5678", "뽀로로", "여성", 10);
        members[2] = new Member("gugu@naver.com", "9999", "둘기찡", "남성", 25);
    }

    // 메서드 - 생성된 회원정보를 회원 배열 끝에 추가하는 기능
    void addNewMember (Member newMember) {
        // 추가된 회원정보 넣을 배열 +1 해주기
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length ; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }

    /**
     * 이메일 중복 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 중복인지 참거짓으로 확인
     */
    boolean isDuplicateEmail(String targetEmail) {
        for(Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }
}