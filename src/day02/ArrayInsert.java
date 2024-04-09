package day02;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {10, 50, 70, 100, 120};
        int newNumber = 66;
        int targetIndex = 2;

        // 50 과 70 사이에 66을 삽입 원츄 !
        // 1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 기존 데이터 새 배열에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr [i];
        }
        // 3. 삽입 위치에서 데이터 뒤로 1칸씩 이동 -> 이동 순서는 끝에서부터 시작 !
        for (int i = arr.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
            // 아래 중간 삽입하는 반복문 코드 처리 !
        }
//        temp[5] = temp[4];
//        temp[4] = temp[3];
//        temp[3] = temp[2];

        // 4. 새로운 데이터를 타겟 인덱스 자리에 복사
        // 새로 생성한 배열 temp에 2번 인덱스 targetIndex에 삽입할 숫자 넣어주기 !
        temp[targetIndex] = newNumber;

        // 5. 주소값 이전
        arr = temp;
        temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));
    }
}
