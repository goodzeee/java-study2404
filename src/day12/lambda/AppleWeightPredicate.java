package day12.lambda;

// 무게를 구체화하도록 한
public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 100;  // 100그램 이상일 때
    }
}
