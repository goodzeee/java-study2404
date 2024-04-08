package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] pets = {"강아지", "고양이", "앵무새"};
        //String[] petsCopy = pets; // 원본 배열 복사가 아니라 배열 주소 복사

        // 새로운 배열 new방을 만들어서 복사본 넣어주기 ! -> 반복문으로 같은 배열 값 넣어주기 !
        String[] petsCopy = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "토끼"; // 원본 배열[1]만 수정

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));
    }
}
