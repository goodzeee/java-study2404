package day12.lambda;

public interface GenericFunction<X, Y> {
    // X를 주면 Y를 추출해주는 것
    Y apply (X x);
}
