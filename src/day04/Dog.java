package day04;

public class Dog {

    // 필드 : 객체의 속성
    String dogName;
    int age;
    boolean injection; // 기본값 false

    // 메서드(함수) : 객체의 기능
    void petInfo() {
        System.out.printf("우리집 강아지는 %s이고 %d살이에요 !\n", dogName, age);
        if (injection) {
            System.out.println("예방접종을 했어요 !");
        } else {
            System.out.println("아직 미접종이에요 !");
        }
    }

    void inject() {
        System.out.printf("%s 강아지를 접종 시켜요 !\n", dogName);
        injection = true;
    }

    // 생성자
    Dog() {
        System.out.println("1번 생성자 호출 !");
    }
    Dog(String dName) {
        System.out.println("2번 생성자 호출 !");
        dogName = dName;
        age = 1;
    }
}
