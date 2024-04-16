package day06.member;

// 역할 : 회원 데이터 관리를 위해 입출력 담당
public class MemberView {

    // 객체의 협력 (필드)
    MemberRepository mr; // 배열 저장소에 만들어논 배열이 필요해서 협력하기 !!

    // 생성자
    MemberView() {
        this.mr = new MemberRepository();
    }

    // 메서드
    void showMembers() {
        System.out.printf("===================현재 회원 목록 (총 %d명)===================\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }
    }
}
