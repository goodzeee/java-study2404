package day08.final_;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("991111-3345668");
        s.name = "강길동";
        //s.nation = "대한민국";
        s.name = "수순팍";
        //s.nation = "영국";
        // ssn 주민번호는 변경 못하게 막아버림
        // 필드에 final 주고, 주민번호용 생성자 만들기

        double currentTemperature = 50.0;  // 현재 기온
        double currentPrecipitation = 60.0; // 현재 강수량

        boolean temperatureAlert = WeatherAnalyzer.checkTemperatureAlert(currentTemperature);
        boolean precipitationAlert = WeatherAnalyzer.checkPrecipitationAlert(currentPrecipitation);

        System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
        System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true
    }
}
