package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {
        // List와 Set 유사함

        // 중복저장 허용 X, 순서가 없음, 비교적 빠른 저장속도
        HashSet<String> set = new HashSet<>();

        set.add("김말이");
        set.add("오뎅");
        set.add("꼬마김밥");
        boolean flag1 = set.add("피카츄");
        boolean flag2 = set.add("피카츄");  // 중복 허용 X

        System.out.println(set);
        System.out.println("flag1 = " + flag1); // true 저장
        System.out.println("flag2 = " + flag2); // false 중복 저장된

        System.out.println(set.size());

        // 탐색시에는 개별 탐색은 불가, 전체 탐색 가능
        for (String s : set){
            System.out.println("s = " + s);
        }
        set.remove("피카츄");
        System.out.println("set = " + set);
        System.out.println("====================================");
        // set 은 보통 데이터 중복을 빠르게 제거할 때 사용
        List<Integer> numbers = List.of(2, 3, 4, 2, 3, 1, 1, 1);

        // 중복된 정수 set으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet); // [1, 2, 3, 4]

        // list로 다시 변환
        numbers = new ArrayList<>(numberSet);
        System.out.println("numbers = " + numbers);
    }
}
