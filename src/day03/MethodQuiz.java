package day03;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz {

    Scanner scan = new Scanner(System.in);

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    // 사이즈를 조절하고 기존 데이터를 복사하는 함수 -> 자주 사용해서 따로 빼서 사용하게 리팩토링
    // push, pop, insert에 사용되는데 size로 파라미터 따로 주기 !
    static String[] copy(int size) {
        String[] temp = makeNewArray(size); // new String[foods.length + size];

        int loopCount = (size >= 0) ? foods.length : temp.length;
        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp; // 리턴되는 데이터 타입으로 메서드 정의
    }

    static void push(String newFood) {
        String[] temp = copy(1);

        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    static int indexOf(String food) {
        //int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (food.equals(foods[i])) {
                return i;
                //index = i;
                //break;
            }
        }
        return -1;
    }
    // foods배열에서 맨 끝 데이터 삭제하는 함수
    static void pop() {
        // push / pop일 때 각각 돌리는 for문 길이가 달라 !
        foods = copy(-1);
    }

    static void remove(String deleteFood) {
        int index = indexOf(deleteFood);
        if (index == -1) return;

        for (int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
   }

    static boolean include(String searchTarget) {
        return indexOf(searchTarget) != -1; // ? true : false;
    }

    static void insert(int targetIndex, String newFoodName) {
        if (isOutOfBound(targetIndex)) return;
        String[] temp = copy(1);
        for (int i = temp.length; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIndex] = newFoodName;
        foods = temp;
    }

    static void modify(int targetIndex, String newFoodName) {
        // 에러 안나게 하는 조건식 추가해주기 ! (0보다 작거나 foods배열보다 더 크지 않게)
        if (isOutOfBound(targetIndex)) return;
        foods[targetIndex] = newFoodName;
    }

    static boolean isOutOfBound(int targetIndex) {
        return targetIndex < 0 || targetIndex > foods.length - 1;
    }

    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();

    } // end main method


} // end class
