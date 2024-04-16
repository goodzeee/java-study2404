package day06.member;

// 역할 : 회원 배열을 관리하는 역할 (회원 배열 데이터 저장소)
public class MemberRepository {

    // 필드 (빈 배열 저장소)
    static Member[] members; // 현재 관리되는 회원 배열
    // 위 members에는 진짜 삭제해야 하고 restoreList에는 push해두기 ! 복구하면 또 반대로
    static Member[] restoreList; // 삭제된 회원들이 모일 배열 (휴지통 느낌 진짜 삭제되기 전)

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("zzang@naver.com", "1234", "짜장이", "남성", 32);
        members[1] = new Member("pororo@naver.com", "5678", "뽀로로", "여성", 10);
        members[2] = new Member("gugu@naver.com", "9999", "둘기찡", "남성", 25);
    }

    // 메서드 - 생성된 회원정보를 회원 배열 끝에 추가하는 기능
    void addNewMember(Member newMember) {
        // 추가된 회원정보 넣을 배열 +1 해주기
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }

    int findIndex(String email) {
        for (int i = 0; i < members.length; i++) {
            if (email.equals(members[i].email)) {
                return i;
            }
        }
        return -1;
    }
    
    void removeMember(String inputEmail) {

        int index = members

        Member[] temp = new Member[members.length - 1];
        for (int i = index; i < temp.length; i++) {
            members[i] = members[i + 1];
        }
        members = temp;
    }

    /**
     * 이메일 중복 확인하는 기능
     *
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 중복인지 참거짓으로 확인
     */
    boolean isDuplicateEmail(String targetEmail) {
        // return findMemberEmail(targetEmail) != null; 리펙토링 결과
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2. 이메일을 통해 회원의 모든 정보(객체)를 가져오는 메서드
     * @param inputEmail - 사용자가 입력한 이메일 값
     * @return
     */
    public Member findMemberEmail(String inputEmail) {
        for (Member m : members) {
            if (inputEmail.equals(m.email)) {
                return m;
            }
        }
        return null;
    }
}
