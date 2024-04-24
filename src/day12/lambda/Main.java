package day12.lambda;

import java.util.List;

import static day12.lambda.Color.*;

public class Main {
    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        System.out.println("=======빨강 사과 필터링=========");
        List<Apple> filterRApples = FilterApple.filterApplesColor(appleBasket, RED);
        System.out.println("filterRApples = " + filterRApples);

        System.out.println("=======노란 사과 필터링=========");
        List<Apple> filterYApples = FilterApple.filterApplesColor(appleBasket, YELLOW);
        System.out.println("filterYApples = " + filterYApples);

    }
}
