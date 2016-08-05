import java.util.Scanner;

/**
 * Created by kualo on 8/2/2016.
 */

public class ZellerCongruence {

    private static String tellDay(int year, int month, int day) {

        int a = (int) (13 * (month + 1) / 5);
        int b = (int) (year / 4);
        int c = 6 * (int) (year / 100);
        int d = (int) (year / 400);
        int sum = a + b + c + d;

        int result = sum % 7;

        switch(result) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return null;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in the year(integer)");
        int year = Integer.valueOf(sc.nextInt());
        System.out.println("Please type in the month(integer)");
        int month = Integer.valueOf(sc.nextInt());
        System.out.println("Please type in the day(integer)");
        int day = Integer.valueOf(sc.nextInt());

        String date = tellDay(year, month, day);

        System.out.println("The date is :" + date);



    }
}
