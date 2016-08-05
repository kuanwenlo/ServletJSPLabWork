import java.util.Scanner;

/**
 * Created by kualo on 8/2/2016.
 */
public class Fehrenheit2CelciusConverter {
    private static double convertToCelsius(double degreeF) {
        double degreeC;
        degreeC = (degreeF - 32) * 5.0 / 9.0;
        return degreeC;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double degreeF = Double.valueOf(line);
        double degreeC = convertToCelsius(degreeF);
        System.out.println(degreeF + " Fehrenheit is " + degreeC + " Celcius");

    }
}
