package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int korScore = 77;
        int engScore = 100;
        int mathScore = 90;
        // 1차원 배열들 수십수백개 나열 ... ?
        int[] scoresKang = {korScore, engScore, mathScore};
        int[] scoresPark = {70, 89, 69};
        int[] scoresJo = {80, 57, 89};

        // 2차원 배열에 담기 : 배열 안의 요소가 또 다시 배열인 형태
        int[][] classScores = {scoresKang, scoresPark, scoresJo};

        System.out.println(classScores.length); // 1차원 배열 갯수 -> 2
        System.out.println(classScores[0] = scoresKang); // true
        System.out.println(Arrays.toString(classScores[1])); // scoresPark 배열 내 값
        System.out.println(classScores[1][2]); // scoresPark -> 69점
        System.out.println(Arrays.deepToString(classScores)); // 2차원 내부 배열 풀어서 보여줌 !
        System.out.println("========================================");

        System.out.println("2차원 배열의 1번 인덱스 주소: " + classScores[1]);
        System.out.println("scoresPark의 주소: " + scoresPark);
        System.out.println("============================================");

        // 2차원 배열의 순회
        for (int i = 0; i < classScores.length ; i++) {
            for (int j = 0; j < classScores[i].length; j++) {
                System.out.printf("%d", classScores[i][j]);
            }
            System.out.println();
        }
        // js: for ~ of, java: enhanced for loop, iteration, foreach
        System.out.println("=========================================");

        for (int[] scores : classScores) { // 2차원 배열에서 꺼내서 반복 순회
            for (int n : scores) { // 2차원 배열에서 꺼낸 걸 1차원 순회 (iter 단축키)
                System.out.printf("%d", n);
            }
            System.out.println();

            System.out.println("========================================");

            int[][] arr2by3 = {
                    {10, 20, 30},
                    {40, 50, 60}
            };

            int[][] arr4by5 = new int[4][5]; // 행열
            for (int[] ints : arr4by5) {
                for (int anInt : ints) {
                    System.out.printf("%d", anInt);
                }
                System.out.println();
            }
        }
    }
}
