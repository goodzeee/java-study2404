package day12.lambda;

import day08.protec.pac1.A;

import java.util.ArrayList;
import java.util.List;

// 사과중에 원하는 데이터만 추출해서 새로운 리스트로 매핑
public class MappingApple {

    // 사과의 색상만 추출
    // 매핑 -> 사과 리스트를 받아서 색상 리스트가 나가게 한다.
    public static List<Color> mappingAppleByColor(List<Apple> basket) {
        List<Color> colors = new ArrayList<>();
        for (Apple apple : basket) {
            colors.add(apple.getColor());
        }
        return colors;
    }
    // 사과의 무게만 추출 (사과 -> 무게 int 추출)
    public static List<Integer> mappingAppleByWeight(List<Apple> basket) {
        List<Integer> weights = new ArrayList<>();
        for (Apple apple : basket) {
            weights.add(apple.getWeight());
        }
        return weights;
    }

    // X 객체에서 Y 객체 리스트를 반환
    // 제너릭 사용 문법 형태 잘보기 !!
    public static <X, Y> List<Y> map (List<X> xList, GenericFunction<X, Y> f) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : xList) {
            //Y y = f.apply(x);
            mappedList.add(f.apply(x)); // 콜백
        }
        return mappedList;
    }
}
