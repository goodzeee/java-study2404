package day09.poly.car;

public class Driver {

    // 모든 자동차 종류를 담고 있는 부모 Car 타입을 가져와서 사용 !!
    public void drive (Car car) {

        String carName = "";
        if (car instanceof Sonata) {
            carName = "쏘나타";
        } else if (car instanceof Tucson) {
            carName = "투싼";
        } else if (car instanceof Mustang) {
            carName = "머스탱";
        }

        System.out.println(car instanceof Sonata); // car 가 소나타인지 확인

        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
}
