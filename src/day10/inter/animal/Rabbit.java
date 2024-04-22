package day10.inter.animal;

// Animal 나이를 갖는 추상 클래스 부모로 받기 !
public class Rabbit extends Animal implements Pet, Wild {

    // 애완동물로 가능
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    // 난폭한 성격 기능
    @Override
    public void violent() {

    }

    // 사냥 기능은 없고


}
