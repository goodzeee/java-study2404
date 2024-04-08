package day01;

public class DataType {
    public static void main(String[] args) {
        // 정수 타입 4가지
        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음.
        // 0(+, -)부호 1111111 -> -127 ~ +127
        byte a = 127; // 1byte 8bit
        short b = 32767; // 2byte 16bit
        int c = 2147483647; // 4byte
        long d = 2147483647645476574L; // 8byte 큰 수 다루기 위해 L붙여주기
        System.out.println(d);

        // 실수 타입 2가지
        float e = 3.144567778353f;
        double f = 3.143274923742974;// 8byte
        double g = 100;
        System.out.println("e = " + e); //soutv
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean flag2 = 10 > 5;

        double random = Math.random(); //ctrl+alt+v

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

        // 문자형 char : 2byte 0~65536 (문자는 부호 필요 없으니)
        char text = '가';
        System.out.println("text = " + text);

        // 문자열 : 문자 배열
        char[] hi = {'안', '녕'};
        System.out.println("hello = " + new String( hi ));

        String hello = "안녕하세요.";
        System.out.println("hello = " + hello);
        
    }
}



