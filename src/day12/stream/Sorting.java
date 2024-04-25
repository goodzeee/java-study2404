package day12.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Sorting {
    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeatDishes = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)  // 육류 타입 필터링
                .sorted(Comparator.comparing(Dish::getCalories))  // 칼로리 낮은 순 정렬
                .collect(Collectors.toList());
        System.out.println(lowCalorieMeatDishes);

        // 메뉴 목록에서 메뉴들을 이름 내림차로 정렬
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed()) // reversed() 오름차
                .collect(Collectors.toList())
                .forEach(System.out::println);  // 반복해서 출력하게 하는

        System.out.println("===========================================================");

        // 칼로리가 300 칼로리보다 큰 요리 중
        // 칼로리 작은 순으로 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)  // limit, skip
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

