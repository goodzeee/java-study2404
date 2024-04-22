package day10.abs;

public class Main {
    public static void main(String[] args) {

        Pet myDog = new Dog();
        Dog myDog2 = new Dog();
        Cat myCat = new Cat();
        Cat myCat2 = new Cat();

        myDog.eat();  // 같은 먹는 기능인데 이름이 유사해서 헷갈려 -.-
        //myCat.havaMeal();  밥 먹는 기능 상속 받은 부모 클래스에서 eat 으로 추상화 !

        GoldFish goldFish = new GoldFish();
        Pet[] petList = new Pet[]{myDog, myDog2, myCat, myCat2, goldFish};

        for (Pet pet : petList) {
            pet.eat();
            pet.sleep();
            }

        }
    }
