package day08.gisa;

public class Child extends Parent{

    private String name;

    public Child() {
        this("홍길동"); // 같은 클래스에 해당 메서드 찾아가기
        System.out.println("Child() call!");
    }

    public Child(String name) {
        //super();
        this.name = name;
        System.out.println("Child(String) call!");
    }
}
