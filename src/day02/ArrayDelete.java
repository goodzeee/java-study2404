package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

     // 배열에서 원하는 위치의 값 삭제하기
     int[] numbers = {1, 3, 5, 7, 9, 11};

     int targetIndex = 2; // 2번 인덱스 5 삭제 원함.

        for (int i = targetIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
            // 아래 댕겨와서 복사해오는 코드 반복문으로 처리 !
        }
//        numbers[2] = numbers[3]; // 1, 3, 7, 7, 9, 11
//        numbers[3] = numbers[4];
//        numbers[4] = numbers[5]; // 1, 3, 7, 9, 11 앞으로 댕겨서 복사해오기

        // 마지막 인덱스 pop : new int[numbers.length - 1];
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
    }
}
