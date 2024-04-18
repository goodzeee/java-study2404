package day08.static_;

import day08.static_.quiz1.Department;

import static day08.static_.Count.*;

public class Main {
    public static void main(String[] args) {


        // static 데이터는 객체생성 없이 접근 가능 !
        x = 20; // 정적 필드
        Count.m1();  // 정적 메서드  --> 객체생성 없으니 정적은 this xx

        Count c1 = new Count();
        c1.m2();   // c1 => this 자기 자신을 가르키는 역할
        Count c2 = new Count();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

//        c2.x = 99; // static int x; -> 값을 여러 개 받지 않고 하나로 통일된 정적 !!
//        c1.x = 50;
        x = 99; // 어차피 값 1개이니 클래스명으로 가져오기
        x = 50;

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        System.out.println("c1.x = " + x);
        System.out.println("c2.x = " + x);
        System.out.println("==============================================");

        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5); // 원주율 구하는 공식 메서드 static => 클래스명으로 하나 공유
        redCal.paint("red");
        blueCal.paint("blue");

        //String color = input("색상 : ");
        System.out.println("===============================================");

        System.out.println(Person.nation);

        Person kang = new Person("강지돌", 20);
        System.out.println(kang.name);
        System.out.println(kang.age);
        System.out.println(kang.nation);
        System.out.println("===============================================");

//        Department compSci = new Department("컴퓨터 과학", 200);
//        Department biology = new Department("생물학", 150);
//        Department chemistry = new Department("화학", 120);
//
//        compSci.addStudent(30);
//        biology.addStudent(20);
//
//        System.out.println("컴퓨터 과학과 학생 수: " + compSci.getStudentCount());
//        System.out.println("생물학과 학생 수: " + biology.getStudentCount());
//        System.out.println("화학과 학생 수: " + chemistry.getStudentCount());
//        System.out.println("전체 학생 수: " + Department.getTotalStudents());
    }
}
