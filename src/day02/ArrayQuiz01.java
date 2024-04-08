package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        System.out.println("#먹고 싶은 음식을 입력하세요 !\n#입력을 중지하려면 <그만> 이라고 입력하세요.");

        Scanner scan = new Scanner(System.in);
        // 문자 입력 받기
        String[] foodList = {};
        while (true) {
            System.out.print(">> ");
            String newFood = scan.nextLine();

            String[] newFoods = new String[foodList.length + 1];

            for (int i = 0; i < foodList.length; i++) {
                newFoods[i] = foodList[i];

            }
            newFoods[newFoods.length - 1] = newFood;
            foodList = newFoods;

            if (newFood.equals("그만")) {
                System.out.println(Arrays.toString(foodList));
                break;
            }
    }
}
}
