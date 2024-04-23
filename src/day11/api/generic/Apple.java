package day11.api.generic; // 복제, 카피

public class Apple {

    private int sweet;

    public Apple(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sweet=" + sweet +
                '}';
    }
}
