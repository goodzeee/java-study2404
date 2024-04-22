package day10.inter.animal;

// 다중 부모 상속 받을 수 있음
public class BullDog extends Animal implements Pet, Aggressive {

    // 애완동물로 가능
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    // 사냥 기능
    @Override
    public void hunt(Pet pet) {

    }

    // 난폭한 성격 기능
    @Override
    public void violent() {

    }

}
