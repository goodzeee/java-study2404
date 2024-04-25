package day12.inner;

public class Main {

    // 내부 클래스 (중첩 클래스)
    // 뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는 Main 클래스 안에서만 사용할 거 같아 ~
    public static class SubCalculator implements Calculator {
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        Calculator cal = new AddCalculator();
        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();
        int r2 = cal.operate(20, 10);
        System.out.println("r2 = " + r2);

        // 익명 클래스 : 이름이 없는 클래스를 빠르게 선언하는 법
        // 클래스를 통해 객체를 생성하긴 할텐데 재활용은 안할거야 => 일회용 객체 !
        cal = new Calculator() {
            // 일회용 객체 생성할 수 있어
            // private int a;
            // private int b;

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };  // 내부 기능 한 번 하고 사라져

        int r3 = cal.operate(10, 10);
        System.out.println("r3 = " + r3);

        // 람다 문법 : 반드시 인터페이스 안의 추상 메서드가 1개여야 한다.
        cal = (int n1, int n2) -> n1 / n2;

        int r4 = cal.operate(20, 5);
        System.out.println("r4 = " + r4);

        System.out.println("=======================================");

        Restaurant fr = new FrenchRestaurant();
        // 프랑스 음식점을 하나만 만들거야 체인점 안할거면 익명 클래스로 일회용 만들기 !!
        Restaurant japaneserestaurant = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("일식 요리를 합니다.");
            }
        };

        // 람다 문법 사용 -> 인터페이스 안에 추상 메서드도 하나고 한 번만 사용할 익명 클래스 요약
        Restaurant italianrestaurant = () -> System.out.println("이탈리아 요리를 합니다.");


    }
}

