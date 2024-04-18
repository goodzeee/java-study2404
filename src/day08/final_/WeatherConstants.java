package day08.final_;

public enum WeatherConstants {

    // 열거형으로 enum (파라미터값 줄 수 있음)
    MAX_TEMPERATURE(40.0), MIN_TEMPERATURE(-10.0), PERCIPITATION(50.0);
    // 1. 담을 필드 만들어주기
    private double numericData;

    // 2. 생성자 생성 !
    WeatherConstants(double numericData) {
        this.numericData = numericData;
    }

    // 3. getter 만들기
    public double getNumericData() {
        return numericData;
    }

    //    static final double MAX_TEMPERATURE = 40.0;
//    static final double MIN_TEMPERATURE = -10.0;
//    static final double PERCIPITATION = 50.0;

//    private WeatherConstants() {}  // 객체 생성 막기 !!
}
