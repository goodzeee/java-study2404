package day12.stream.quiz1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        transactions.stream()
                .filter(y -> y.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                //.collect(toList())
                .forEach(System.out::println);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        List<String> cityName = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct() // 중복 제거
                .collect(Collectors.toList());  // toSet() -> 중복 제거 가능
        System.out.println(cityName);


        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("======================================");
        List<Trader> tranName = transactions.stream()
                .filter(c -> c.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getTrader())  // 추출하고 싶은 리스트 매핑
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(tranName);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        List<String> nameList = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()  // 이름 리스트를 매핑해뒀으니 그냥 해두 됨. reverseOrder() 정렬기준 없을 때 내림차
                .collect(toList());
        System.out.println("nameList = " + nameList);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(m -> m.getTrader().getCity().equalsIgnoreCase("Milan")); //대소문자 무시하며 동등 비교
        System.out.println("flag1 = " + flag1);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalSum = transactions.stream()
                .filter(n -> n.getTrader().getCity().equals("Cambridge"))
                .mapToInt(c -> c.getValue())
                .sum();
        System.out.println("totalSum = " + totalSum);


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxValue = transactions.stream()
                .mapToInt(v -> v.getValue())
                .max()
                .getAsInt();   // [1000] -> 깔꼼하게 정수만 나오게 해줌 1000
        System.out.println("maxValue = " + maxValue);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        // 자바의 단점 : 널체크 문법이 없음 (if로 null이 아니라면을 넣어줘야 하는 번거로움)
        // Optional
        Transaction minValue = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .orElse(null);  // 만약 결과가 null 일 경우 어떻게 할거야 ? if 조건문보다 단순
        System.out.println("minValue = " + minValue);

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        transactions.stream()
                .filter(v -> v.getValue() >= 500)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        // 최소거래액 찾기
        int minValue2 = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();

        // 평균 구하기
        double average = transactions.stream()
                .filter(trs -> trs.getValue() > minValue2)
                .mapToInt(Transaction::getValue)
                .average()
                .getAsDouble();

        System.out.println("average = " + average);


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(toList());

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);


        System.out.println("=====================");
        for (Integer year : groupByYearMap.keySet()) {
            System.out.println("year = " + year);
            for (Transaction transaction : groupByYearMap.get(year)) {  // map.get(키명) -> 값이 나옴
                System.out.println(transaction);
            }

            // 집계할 때 편리하게 사용할 방법
            Map<Integer, List<Transaction>> cambrige = transactions.stream()
                    .filter(t -> t.getTrader().getCity().equals("Cambrige"))
                    .collect(Collectors.groupingBy(t -> t.getYear())); // groupingBy() 자동으로 키가 연도가 되고 해당 연도에 맞는 객체를 리스트로 출력.
                    cambrige.forEach((key, value) -> {
                        System.out.println("year = " + key);
                        value.forEach(System.out::println);
                    });

        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */


            // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
            // 출력 값 : 700
            System.out.println(maxValue - minValue2);
        }
    }
}
