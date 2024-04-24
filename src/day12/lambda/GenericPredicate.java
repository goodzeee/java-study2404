package day12.lambda;

public interface GenericPredicate<T> {
    // T에 모든게 들어올 수 있어 아무거나 들어와도 처리할 수 있어짐 !
    boolean test(T t);
}
