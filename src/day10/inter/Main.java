package day10.inter;

public class Main {
    public static void main(String[] args) {
        // 추상화 인터페이스인 SmartPhone 객체생성 구체화 불가능

        // 부모 인터페이스 클래스로 받아오기 가능 !
        SmartPhone galaxy = new Galaxy();
        SmartPhone iphone = new Iphone();

        System.out.println(SmartPhone.AGE + "살");
    }
}
