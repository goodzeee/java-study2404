package day09.poly.car;

public class CarShop {

    // 돈을 주면 자동차를 출고하는 기능
    // - 자동차 종류를 다 담고 있는 부모 Car 타입으로 사용하기 !
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 4000) {
            return new Tucson();
        } else if (money == 3000) {
            return new Sonata();
        } else {
            return null;
        }
    }
}
