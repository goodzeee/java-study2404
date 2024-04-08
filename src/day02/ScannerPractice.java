package day02;

import java.io.IOException;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("**** 상품 재고 총액 구하기 ****");

        System.out.print("-상품의 가격 : ");
        int price = Integer.parseInt(scan.nextLine());

        System.out.print("-상품의 수량 : ");
        int count = Integer.parseInt(scan.nextLine());

        System.out.println("=====================================");

        int total = price*count;
        System.out.println("상품 재고 총액 : " + total);
    }
}
