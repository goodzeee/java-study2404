package day05;

// 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기 위해 사용 !!
// 클래스명이 겹치거나 패키지가 길 때 import해서 사용시 good ~~
// 다른 패키지 폴더에 있는 것은 import해와서 사용 필수
//import day05.juice.Apple;
//import day05.juice.Banana;
import day05.juice.*; // 전체 불러오기 *

import java.util.Scanner;

public class PackageMain {
    public static void main(String[] args) {

        day05.fruit.Apple a1 = new day05.fruit.Apple(); // fruit에 있는 패키지 폴더 사용시엔 풀 패키지명 써야 함.
        Apple a2 = new Apple();
        new Banana();
        new Peach();

        Scanner scan = new Scanner(System.in);
    }
}
