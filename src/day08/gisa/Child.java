package day08.gisa;

public class Child extends Parent{

    private String name;

    public Child() {
        this("홍길동"); // 같은 클래스에 해당 생성자 찾아가기
        System.out.println("Child() call!");
    }

    public Child(String name) {
        //super(); 1번. 상위 클래스 생성자 먼저 실행 !
        this.name = name;
        System.out.println("Child(String) call!");
    }

    void aaa() {
        bbb();
        System.out.println("aaa");
    }
    void bbb() {
        System.out.println("bbb");
        ccc();
    }
    void ccc() {
        System.out.println("ccc");
    }
}

// 생성자 안에 super() or this( ) 가 존재해야 함 !! 숨겨져 있다는 거 인지하기