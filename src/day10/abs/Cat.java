package day10.abs;

public class Cat extends Pet {

//    String name;
//    int age;
//    String kind;

    public Cat() {
        super();
    }

    // 밥 먹고 자는 메서드 기능 ! (메서드명만 다르고 동일한 기능)
    // 추상화가 안되어 있는 것 !
    @Override
    public void eat() {
        System.out.println("고양이가 생선을 먹어요 !");
    }
    public void sleep() {
        System.out.println("고양이가 쿨쿨 낮잠을 자요 ~");
    }
}
