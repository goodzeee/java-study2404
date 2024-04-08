package day01;

public class RandomExample {
    public static void main(String[] args) {

        // 연산자 우선순위
        // 단항(++, --, !) > 이항(+, * ..) > 삼항(? :) > 대입(=)
        int a = 10;
        int b = ++a - 10 * 3;
        System.out.println(b); // -19
        
        /* 
         자바에서 난수 만들기
         Math.floor -> (int) 형변환 넣기 !
         * 연산 우선순위 *
         (Math.random() * 10) => 0.0 <= ~ < 10.0
         (int) Math.random => 0 <= ~ < 10
         */
        int rn = (int) (Math.random() * 10) + 1; // 1 ~ 10까지 랜덤 난수 공식
        System.out.println("rn = " + rn);
    }
}
