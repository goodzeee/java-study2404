package day12.stream;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {

        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        // 배열 리스트.stream.filter
        // 람다 문법으로 간단히 작성하기
        List<Dish> dishList = menuList.stream().filter(dish -> dish.isVegeterian()).collect(Collectors.toList());
        System.out.println(dishList);
//        Menu.menuList.stream().filter(new Predicate<Dish>() {
//            @Override
//            public boolean test(Dish dish) {
//                return dish.isVegeterian();
//            }
//        });

        // 배열 순회  forEach
        dishList.forEach(dish -> {
            System.out.println(dish.getName());
        });

        // 메뉴 목록 중에 육류이면서 600칼로리 미만인 요리 필터링해서 출력
        List<Dish> meatList = menuList.stream().filter(meat -> meat.getType() == Dish.Type.MEAT && meat.getCalories() < 600).collect(Collectors.toList());
        meatList.forEach(meat -> {
            System.out.println(meat.getName());
        });

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링
        menuList
                .stream()//Stream<Dish>
                .filter(d -> d.getName().length() == 4)
                .collect(Collectors.toList())//Lit<Dish>)
                .forEach(d -> System.out.println(d));

        // 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList
                .stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        // 300칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList
                .stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        List<Integer> num = List.of(1, 2, 3, 4, 3, 4, 6);
        // 리스트에서 짝수만 필터링
        List<Integer> integerList = num.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
