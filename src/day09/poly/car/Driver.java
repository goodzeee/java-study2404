package day09.poly.car;

public class Driver {

    // 모든 자동차 종류를 담고 있는 부모 Car 타입을 가져와서 사용 !!
    public void drive (Car car) {
        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
