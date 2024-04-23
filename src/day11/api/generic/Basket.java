package day11.api.generic;

public class Basket<F> {
    // 제네릭 클래스 : 타입 복제가 가능한 클래스

    // Object -> F 로 !!
    // 호출할 때 가져오는 클래스가 F 자리로 들어오는거 !
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
