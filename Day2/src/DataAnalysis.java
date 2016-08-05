import java.util.Scanner;

/**
 * Created by kualo on 8/3/2016.
 */
public class DataAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many data input? ");
        int num = sc.nextInt();
        int[] array = new int[num];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i ++) {
            array[i] = sc.nextInt();
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int avg = sum / num;
        System.out.println("The mean is " + avg);
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
    }
}
