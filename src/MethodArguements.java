/**
 * Created by kualo on 8/3/2016.
 */
public class MethodArguements {
    /*
    public static int addUP(int a, int b) {
        return a + b;
    }
    public static double addUP(double a, double b) {
        return a + b;
    }
    public static int addUP(String a, String b) {
        return toNumber(a) + toNumber(b);
    }
    */
    public static int addUP(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("addUp(int[]) : ");
        return sum;
    }
    public static double addUP(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        System.out.println("addUp(double[]) : ");
        return sum;
    }
    public static int addUP(String[] array) {
        int sum = 0;
        for (String element : array) {
            sum += toNumber(element);
        }
        System.out.println("addUp(String[]) : ");
        return sum;
    }


    private static int toNumber(String num) {
        switch(num) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] b = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] c = {"one", "two", "zero", "nine"};
        System.out.println(addUP(a));
        System.out.println(addUP(b));
        System.out.println(addUP(c));

    }
}
