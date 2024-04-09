package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        System.out.println("#먹고 싶은 음식을 입력하세요 !\n#입력을 중지하려면 <그만> 이라고 입력하세요.");

        Scanner scan = new Scanner(System.in);
        // 음식 리스트를 담을 배열 생성
        String[] foodList = {}; // new String[] {} 앞에 생략 가능

        while (true) {
            System.out.print(">> ");
            String newFood = scan.nextLine();

            if (newFood.equals("그만")) break;

            // 기존 배열보다 사이즈가 1개 큰 새 배열 생성(음식 담을 것)
            String[] newFoods = new String[foodList.length + 1];

            // 기존 foodList에 있던 음식들 새 배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                newFoods[i] = foodList[i];
            }
            // 입력받은 새 음식 값을 새 배열 끝 인덱스에 추가
            newFoods[newFoods.length - 1] = newFood;
            // 추가 받은 새 배열을 foodList에 넣어주기
            foodList = newFoods;
    } // end while
            System.out.println(Arrays.toString(foodList));
}
}
