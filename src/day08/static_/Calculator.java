package day08.static_;

public class Calculator {

    String color;
    static double pi;   // 원주율 값은 only 1 = static 정적으로

    // 원의 넓이를 구하는 메서드 => 공식이 동일하니 static 으로
    static double calcArea(int r) {
        return pi * r * r;
    }
    // 계산기에 색칠하는 메서드
    void paint(String color) {
        this.color = color;
    }
}
