package day04;

// 설계용 클래스 / 실행용 클래스 나눠서 작업한다 !!
// 실행용 클래스 : 객체를 생성해서 객체의 기능을 실행시키는 곳 - main이 필요
public class DancerMain {

    public static void main(String[] args) {

        // 설계도(클래스)를 통해 객체를 찍어냄(생성) !
        // 타입이 여러 개 섞여있으니 아예 설계도 만들어논 클래스명을 가져온다 !
        Dancer Kang = new Dancer();

        // 객체의 속성 부여
        Kang.dancerName = "강지돌";
        Kang.crewName = "트랜들리";
        Kang.genre = "코레오";
        Kang.dancerLevel = 1;
        Kang.introduce();
        Kang.dance();

        // 두번째 댄서
        Dancer Park = new Dancer();

        Park.dancerName = "박수순";
        Park.crewName = "프로텍터";
        Park.genre = "힙";
        Park.dancerLevel = 1;
        Park.introduce();
        Park.dance();

        // Dancer() -> 클래스에 생성자로 만들어논 함수 호출 느낌 !
        Dancer Jo = new Dancer();
        Jo.dance();

        Dancer hong = new Dancer("홍태풍");
        hong.dance();
        //hong.introduce();

        Dancer nana = new Dancer("이나나", "갱갱갱 !");
        nana.dance();
        nana.introduce();

        Dancer rock = new Dancer("최하니", "스트릿푸드파이터", "락킹");
        rock.introduce();
    }
}
