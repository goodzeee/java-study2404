package day10.inter.animal;

public class Duck extends Animal implements Pet, Wild {

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {
        System.out.println("쪼아버려");
    }
}
