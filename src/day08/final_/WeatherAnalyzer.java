package day08.final_;

import static day08.final_.WeatherConstants.*;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double currentTemperature) {
        if (currentTemperature > MAX_TEMPERATURE.getNumericData() || currentTemperature < MIN_TEMPERATURE.getNumericData())
            return true;
        return false;
    }

    public static boolean checkPrecipitationAlert(double currentPrecipitation) {
        if (currentPrecipitation > PERCIPITATION.getNumericData())
            return true;
        return false;
    }
}
