/**
 * Created by kualo on 8/3/2016.
 */
public class Reading {
    private String day;
    private int hour;
    private int temperature;
    private int windSpeed;
    Reading(String line) {
        String[] data = line.split(", ");
        day = data[0];
        hour = Integer.valueOf(data[1]);
        temperature = Integer.valueOf(data[2]);
        windSpeed = Integer.valueOf(data[3]);
    }
    public String rateTemperature() {
        if (temperature < 55) {
            return "cold";
        } else if (temperature < 65) {
            return "mild";
        } else if (temperature < 80) {
            return "warm";
        } else {
            return "hot";
        }
    }
    public String getTime() {
        String time = "";
        if (hour == 9) {
            time = "morning";
        } else if (hour == 15) {
            time = "afternoon";
        } else if (hour == 21) {
            time = "evening";
        }
        return day + " " + time;
    }
}
