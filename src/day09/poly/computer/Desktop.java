package day09.poly.computer;

public class Desktop  {

    // 다형성은 객체의 교환성을 높여주며
    // 객체가 특정 부품객체에 종속(의존)되지 않도록 하게 해준다.
    Monitor monitor;    // 모니터에 역할을 하는 객체를 주기
    // LgMonitor monitor; 특정 모니터에 종속되면 안되게 하기

    public Desktop(Monitor monitor) {
        this.monitor = monitor;
    }

    // 모니터를 교체하는 메서드 기능
    public void changeMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
