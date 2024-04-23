package day11.api.lang;

// lang 은 import 가 필요 없다. 생략되어 있음.

import java.util.Objects;
// Object => toString, equals, hashcode, getClass 속성들 사용 !

class Pen {

    long serial;
    String color;
    int price;
    Company company;  // Company 클래스 내부 { 객체들 }

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
        this.company = company;
    }
    // toString 오버라이딩
    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
    // 펜의 시리얼 번호가 같으면 같은 펜으로 취급하게 한다.
    // equals 를 오버라이딩할 때 반드시 hashcode 도 같이 오버라이딩하여 두 객체가 같을 경우 주소값도 같게 만든다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial); // serial 만 같으면 두 해시코드 값을 같게 한다는 조건 !
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Pen) {
//            Pen target = (Pen) o; // 다운 캐스팅
//            return this.serial == target.serial;
//        }
//        return false;
//    }
}

class Company extends Object {
    
    String companyName;
    String address;

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    // String 오버라이딩
//    @Override
//    public String toString() {
//        return "히히히";
//    }
    // toString() - 자동 생성 기능으로 ok
    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class ObjectSample extends Object {
// 최상단 부모 Object 상속
    public static void main(String[] args) {

        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company.toString());

        Pen redPen = new Pen(100L, "빨강", 1200, company);
        //System.out.println("company = " + redPen.company);

        String cName = redPen.company.companyName;
        System.out.println("cName = " + cName);
        System.out.println("redPen = " + redPen);

        System.out.println("===================================================================");
        Pen bluePen = new Pen(200L, "파랑", 1200, new Company("제트스트림", "도쿄"));

        System.out.println(redPen == bluePen); // 해시값이 같을 때 true 다를 때 false
        // 각각 펜 객체 해시코드 받아오기 => 서로 다른 위치에 존재하는 걸 알게 됨. false
        System.out.println(Integer.toHexString(bluePen.hashCode())); // 16진수로 볼 수 있음
        System.out.println(redPen.hashCode());
        System.out.println("======================================");

        // 만약에 펜의 시리얼 넘버가 같다면 같은 펜으로 취급하겠다.
        Pen yelloPen = new Pen(150L, "노랑", 1000, company);
        Pen yelloPen2 = new Pen(150L, "노랑", 1300, company);

        System.out.println(yelloPen == yelloPen2); // false
        System.out.println(yelloPen.equals(yelloPen2));  // true (equals 오버라이딩 해둠) 기본 equals 는 => == 의미와 일치하다 !

        System.out.println("yelloPen = " + yelloPen.hashCode());
        System.out.println("yelloPen2 = " + yelloPen2.hashCode());

        // finalize() : 객체 소멸자 역할  <---> 객체 생성자

    }

}
