package day08.enum_;

// enum 열거형 => 상수를 모아 놓은 클래스 !!
public enum PizzaStatus {

    ORDERED("주문완료", 20), READY("준비완료", 30), DELIVERED("배달완료", 45);

    private String description; // 상태 설명
    private int timeToSetup; // 소요 시간

    PizzaStatus(String description, int timeToSetup) {
        this.description = description;
        this.timeToSetup = timeToSetup;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeToSetup() {
        return timeToSetup;
    }
}
