package day01;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 100; // 1byte
        int b = a;    // 4byte
        // 작은 공간 -> 큰 공간으로 이동 가능하니
        // 암묵적 형 변환 !!
        System.out.println("b = " + b);
        
        int c = 1000;
        // 큰 -> 작은 공간으로 이동시 싸인 (바꿀 타입) 적어주기
        // 명시적 형 변환
        byte d = (byte) c;
        System.out.println("d = " + d);

        // 암묵적 형 변환 가능
        int k = 50;
        double j = k;

        double m = 5.567;
        int n = (int) m; // 다 버리고 5만 나와
        System.out.println("n = " + n);
        // 암묵적 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting
        // => 데이터 손실 일으킬 수 있는 문제 주의하기 !

        int v = 100; // 작
        double z = 5.5;  // 큰

        // 타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다.,
        // 작 + 큰 => 큰 데이터 타입으로 따라감.
        double result = v * z;
    }
}
