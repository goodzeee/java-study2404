package day10.abs;

public class Dog extends Pet {

//    String name;
//    int age;
//    String kind;

    // 밥 먹고 자는 메서드 기능 !
    // 각 자식 클래스에서 기능 구체화 !
    public void eat() {
        System.out.println("강아지가 사료를 먹어요 !");
    }
    @Override
    public void sleep() {
        System.out.println("강아지가 마당에서 낮잠을 자요 ~");
    }
}
