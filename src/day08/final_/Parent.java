package day08.final_;

class Child extends Parent {

    @Override
    void sing() {
        System.out.println("노래 랄랄라");
    }

//    @Override -> 상속하기 위한 !
//    void dance() {   // 상위 클래스 final 있는 메서드 상속 불가 !!
//        System.out.println("춤 빡빡빡");
//    }
}

public class Parent {   // 아래 모든 것을 다 최종으로 사용하려면 이 부분에 final !!

    void sing() {
        System.out.println("노래 씽씽씽");
    }
    final void dance() {  // final -> 여기에 부여된 것을 마지막 최종 기능으로 걸어놓기 !
        System.out.println("춤 땐스땐스땐스");
    }

}
