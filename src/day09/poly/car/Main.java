package day09.poly.car;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Sonata sonata2 = new Sonata();
        Car sonata3 = new Sonata();

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음. (원래 배열 규칙 : 동종모음 묶음 !)
        Car[] cArr = {sonata1, tucson1, mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }

        // 최상위 클래스 Object 배열은 모든 타입 다 사용할 수 있게 됨.
        Object[] sArr = {"abc", 100, false};

        System.out.println("======================================");

        Driver dirver = new Driver();
        dirver.drive(sonata2);
        dirver.drive(new Sonata());

        dirver.drive(new Mustang());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("================================");

        CarShop shop = new CarShop();
        // 객체타입에서 다운캐스팅 전제조건 : 반드시 상속관계가 있어야 하며
        // 자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 잇음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);  // 원래 부모 Car 타입을 받았는데 자식으로 다운 캐스팅 !!
        car.accelerate();
        car.joinSonataClub();

        System.out.println("=============================");
        // Sonata ccc = (Sonata) new Car(); // 불가능 부모타입 => 자식타입으로 못 내려 !!

        // Sonata mmm = (Sonata) new Mustang();

        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        dirver.drive(new Tucson()); // false
        dirver.drive(new Sonata()); // true

    }
}
