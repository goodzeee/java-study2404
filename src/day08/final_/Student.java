package day08.final_;

public class Student {

    String name;
    private final String ssn;  // 주민번호
    // static final => 국적 변경 불가능하게 상수로 !!
    static final String nation = "대한민국"; // 국적

    Student(final String ssn) {  // 지역변수에 final 걸어서 주민번호 따로 변경 못하게 안전성
        //ssn = "980221-3959864"; 지역변수 final 로 값 변경 불가 !!
        this.ssn = ssn;  // 초기 생성자에 final ssn 고정된 값으로 !!

        double pi = Math.PI; // 원주율 PI 불변의 값이니 static final 존재 !!
    }
}
