package day12.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링하는 클래스
public class FilterApple {

    /**
     * @solution - 1. 사과바구니 안에서 색상이 녹색인 사과들만 필터링하고 싶어 !
     * @param basket - 다양한 사과가 들어있는 리스트
     * @return - basket 에서 녹색사과만 필터링한 리스트
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면 이 메서드는 한계
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 녹색사과만 담을 전용 메서드임 !!
        // 녹색사과만 담을 바구니 생성
        List<Apple> greenApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }

        }
        return greenApples;
    }

    /**
     * @solution - 2. 색상을 파라미터화 하여 원하는 컬러의 사과를 필터링 한다.
     * @param basket
     * @param color - 원하는 필터링 색상
     * @return
     * @problem - 필터 기준이 색상이 아니라 무게 기준이면 ? 무게와 색상 기준이면 ?
     */
    public static List<Apple> filterApplesColor(List<Apple> basket, Color color) {

        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredApples.add(apple);
            }

        }
        return filteredApples;
    }

    /** 자바에선 파라미터 안에 함수를 넣을 순 없어
     * @solution - 3. 동작(메서드)을 추상화시켜 파라미터화 한다.
     * @param basket
     * @return
     * @problem - 필터링 대상이 사과가 아니라 오렌지면 ? 학생이면 ?
     */
    // 필터링 조건을 파라미터화할 수 없을까 ??
    // 함수를 객체로 싸서 보내기 ==> interface Foo 만들어서 추상화 -> 구체화하여 사용하삼
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p) {
        List<Apple> filteredApples = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (p.test(apple)) {
                filteredApples.add(apple);
            }

        }
        return filteredApples;
    }

    /**
     *
     * @param basket - 4. 여러 객체들을 필터링
     * @param p
     * @return
     */ // 특정 만들어논 클래스 말고 받는거에 따라 달라지도록 !
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> p) {
        List<T> filteredList = new ArrayList<>();
        // 반복문과 조건문을 통해 필터링
        for (T t : basket) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}

