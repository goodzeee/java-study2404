package day11.collection.map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
// Map : 빨리 새로운 객체 생성하려고 할 때 사용하기 !!
        
        // Map : 제네릭 2개 받음 <2개>
        // key - value 쌍으로 받는 형식
        Map<String, Object> map = new HashMap<>();

        // 데이터 추가
        map.put("지갑잔액", 500);
        map.put("취미", "산책");
        map.put("좋아하는 자동차", new Mustang());
        map.put("오늘 저녁 메뉴", "토계볶");
        System.out.println("map = " + map);

        Map<String, Object> emp = new HashMap<>();
        emp.put("empaName", "강길동");
        emp.put("empAge", 32);
        System.out.println(emp.size());
        System.out.println(map.size());

        // get(key)
        int money = (int) map.get("지갑잔액");
        System.out.println("money = " + money); // 키의 값 가져오기 500 출력 !

        // 중복된 키를 저장하면 값이 수정된다.
        map.put("지갑잔액", 10000);
        System.out.println(map);

        //map 의 반복문 처리
        for (String s : map.keySet()) {  // 키명만 가져오게 keySet()
            System.out.println("key = " + s);
            System.out.println("value = " + map.get(s)); // 값 가져올 땐 get()
        }
    }
}
