package day04;

public class DogMain {
    int a = 11; // 클래스 안에 존재 = 필드임

    public static void main(String[] args) {

        // main 안에서 만들어서 필드 아님 ! 지역 변수임.
        Dog ppopy = new Dog("뽀삐");
        Dog tori = new Dog("토리");

        System.out.println("ppopy = " + ppopy);
        System.out.println("tori = " + tori);

        ppopy.petInfo();
        System.out.println("=====================================");

        tori.inject();
        tori.petInfo();
    }
}
