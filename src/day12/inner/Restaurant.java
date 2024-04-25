package day12.inner;

// 람다를 사용할 수 있는 인터페이스인지 점검
@FunctionalInterface
public interface Restaurant {

    // 요리하는 추상 메서드 껍데기만 만들기
    void cook();
    // void reserve();
}
