package day11.api.lang;

public class SystemExample {

    public static void main(String[] args) {
// System => 생성자 빼고 가져와 사용할 수 있음.

        // 프로그램의 실행시간 체크할 때 사용 = currentTimeMillis
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);

        String s = "";
        for (int i = 0; i < 50000; i++) {
            s += "abc";
        }
        long end = System.currentTimeMillis();
        long time = end - start;  // 실행에 걸린 시간
        System.out.println("time = " + time / 100.0 + "초");
    }
}
