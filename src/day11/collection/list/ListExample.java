package day11.collection.list;

import day07.modi.pac1.A;

import java.util.ArrayList; // 배열 복사, 삭제 등 배열 관련 가져와서 사용하게 해둠 !!
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // 배열 만들기 귀찮아 => ArrayList 사용하기
        ArrayList<String> foods = new ArrayList<>();  // 내가 필요한 배열을 <String> 넣어주기 (타입 넣어도 되고 만든 다른 클래스 넣어도 됨)

        foods.add("팟타이");
        foods.add("돈까스");
        foods.add("훠궈");
        foods.remove(2);
        System.out.println("foods = " + foods);

        // 중간삽입 add(index, E)
        foods.add(1, "프랭크버거");
        System.out.println("foods = " + foods);
        
        int size = foods.size(); // length() 와 같은 size()길이를 가져옴
        System.out.println("size = " + size);
        
        int index = foods.indexOf("돈까스");  // 해당 값 인덱스 위치
        System.out.println("index = " + index);

        boolean flag = foods.contains("팟타이");  // "팟타이" 값 포함되어 있는지
        System.out.println("flag = " + flag);

        foods.remove("돈까스");
        System.out.println(foods);

        foods.set(1, "동파육");   // set(인덱스, 값) 대체 변경하는 기능 !
        System.out.println(foods);

        String get = foods.get(1);  // = foods[1]
        System.out.println("get = " + get);

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i) + "꿀맛");
        }
        System.out.println("======================================");

        for (String food : foods) {
            System.out.println(food + " JMT!!");
        }

        foods.clear(); // 배열 다 없애기 !

        // 리스트에 초기값 넣고 시작
        List<Integer> num = new ArrayList<>(List.of(49, 19, 10, 20, 30));
        System.out.println("num = " + num);

        // 오름차 정렬
        num.sort(Integer::compareTo);
        System.out.println("num = " + num);
        // 내림차 정렬
        num.sort(Comparator.reverseOrder());
        System.out.println("num = " + num);
    }
}
