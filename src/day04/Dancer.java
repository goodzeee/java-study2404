package day04;

// 이제 class ? 객체를 찍어내는 설계도를 뜻한다.
// 라이브러리 클래스 : 설계도의 역할만 함, 실행은 안함 - main이 없음
public class Dancer {
    //public static void main(String[] args) {

    // 클래스에서는 객체의 속성과 기능을 정의

    // 객체의 속성(= 필드) : 객체를 표현하는 데이터
    String dancerName; // 댄서 이름 (변수가 절대 아님 !!)
    String crewName; // 팀 이름
    String genre; // 장르
    int dancerLevel; // 0:초보 1:아무추어 2:프로

    // 객체의 기능(= 메서드) : 객체가 할 수 있는 일, 행위
    // static 붙이지 않음.
    // 자기소개 기능
    void introduce() {
        System.out.println("이름 : " + dancerName);
        System.out.println("팀명 : " + crewName);
        System.out.println("장르 : " + genre);
        System.out.println("레벨 : " + dancerLevel);
    }

    // 춤 추는 기능
    void dance() {
        System.out.printf("%s 댄서가 %s 춤을 춥니다.\n", dancerName, genre);
    }

    // 생성자 (constructor) : 객체가 생성될 때 초기값을 세팅해주는 함수의 일종
    // 1. 생성자는 함수의 일종인데 반드시 이름이 클래스 이름과 같아야 한다.
    // 2. 생성자는 리턴값이 없음 따라서 void가 생략됨.
    Dancer() {
        dancerName = "조둥짝";
        crewName = "팝핀크루";
        genre = "팝핀";
        dancerLevel = 2;
    }

    // 생성자는 여러 개 만들 수 있음 : ' 생성자 오버로딩 '
    // 규칙 : 파라미터가 달라야 함.
    Dancer(String dName) {
        dancerName = dName;
        crewName = "우리 감성 모르면 나가라";
        genre = "얼반";
        dancerLevel = 2;
    }

    Dancer(String dName, String cName) {
        dancerName = dName;
        crewName = cName;
        genre = "케이팝";
        dancerLevel = 1;
    }

    Dancer(String dName, String cName, String gName) {
        dancerName = dName;
        crewName = cName;
        genre = gName;
        dancerLevel = 0;
    }
}

