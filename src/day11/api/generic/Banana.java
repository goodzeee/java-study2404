package day11.api.generic;

public class Banana {

    private int sweet;

    public Banana(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "sweet=" + sweet +
                '}';
    }
}
