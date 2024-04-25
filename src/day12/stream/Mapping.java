package day12.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.stream.Menu.*;

// map : 리스트에서 원하는 데이터만 추출
// 오리지널 리스트에서 데이터 타입 다르게 해서 추출하는 것
public class Mapping {

    public static void main(String[] args) {

        menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(menuList);

        List<String> words = List.of("safari", "chrome", "opera", "firefox");
        List<Integer> collected = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(collected); // [6, 6, 5, 7] 글자 길이 추출

        List<Character> characters = words.stream()
                .map(w -> w.charAt(0)) // 문자열에서 해당 인덱스 위치에 글자 추출
                .collect(Collectors.toList());
        System.out.println(characters);  // [s, c, o, f]

        // 메뉴 목록에서 메뉴 이름과 칼로리를 추출해서 새로운 객체에 포장하고 싶음.
        List<SimpleDish> simpleDishes = menuList
                .stream()
                // 만들어둔 클래스에서 이름과 칼로리만 겟하여 가져오기
                .map(d -> new SimpleDish(d)) // 모든 필드 get 하여 가져올 수 없으니 " d.getName(), d.getCalories() " 대신
                .collect(Collectors.toList());

        simpleDishes.forEach(dd -> System.out.println(dd));
        System.out.println("===============================================================");
        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 MEAT 는 육류라고 FISH 는 어류라고 OTHER 는 기타로 저장 -> 새로운 클래스 생성
         */
        List<DishDetail> dishDetails = menuList.stream()
                .filter(d -> d.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .collect(Collectors.toList());

        System.out.println(dishDetails);

        // 메뉴 목록에 있는 요리들의 총 칼로리 수 구하기

        int sum = menuList.stream()
                .mapToInt(c -> c.getCalories()) // mapToInt -> sum 총합 사용할 수 있음
                .sum();
        System.out.println("sum = " + sum);   // 4300

        // 육류 메뉴의 평균 칼로리
        double avgMeatCalories = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(c -> c.getCalories())
                .average() // 평균 구하기
                .getAsDouble(); // 실수로 나오게 하기
        System.out.println("avgMeatCalories = " + avgMeatCalories);
    }
}
