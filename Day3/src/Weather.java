import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by kualo on 8/3/2016.
 */
public class Weather {

    public static void main(String[] args) throws Throwable {

        BufferedReader br = Files.newBufferedReader(
                Paths.get("Day3/src/weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;

        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        // remaining code here
        for (Reading reading : readings) {
            System.out.println(reading.getTime() + " was " + reading.rateTemperature());
        }
    }
}
