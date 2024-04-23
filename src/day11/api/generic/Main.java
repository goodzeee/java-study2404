package day11.api.generic;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10)); // 당도 10짜리 새로운 사과
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana(5));
        Banana banana = bb.getBanana();
        System.out.println("banana = " + banana);

        // Apple 전용 바구니 생성 ! <Apple>
        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setFruit(new Apple(4));
        Apple fruit = appleBasket.getFruit();
        System.out.println("fruit = " + fruit);
        //appleBasket.setFruit(new Banana(4));
    }
}
