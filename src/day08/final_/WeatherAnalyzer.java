package day08.final_;

import static day08.final_.WeatherConstants.*;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double currentTemperature) {
        if (currentTemperature > MAX_TEMPERATURE || currentTemperature < MIN_TEMPERATURE)
            return true;
        return false;
    }

    public static boolean checkPrecipitationAlert(double currentPrecipitation) {
        if (currentPrecipitation > PERCIPITATION)
            return true;
        return false;
    }
}
