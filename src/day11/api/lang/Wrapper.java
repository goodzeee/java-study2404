package day11.api.lang;

public class Wrapper {

    // 원시 타입 - 객체 타입 차이 : 기본값 차이 존재
    private int num1;  // 기본값 0
    private Integer num2;  // 기본값 null


    public static void main(String[] args) {

        // Wrapper type : 원시 데이터 타입을 객체지향인 자바에서 사용하는 타입으로 만들어줌 !!
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character
        Integer a = 10;  // int a = 10; 과 동일함 ! 타입을 객체로 표현했을 뿐
        Double b = 3.14;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
