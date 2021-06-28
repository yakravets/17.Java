import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String [] args) {

        int[] arr = new int[10];
        fillArr(arr);
        showArr(arr);

        showMin(arr);
        showMax(arr);
        showCountPositive(arr);
        showZeroElement(arr);
    }

    private static void showZeroElement(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                count+=1;
            }
        }
        System.out.format("Count zero: %s", count);
        System.out.println();
    }

    private static void showCountPositive(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > 0)
            {
                count+=1;
            }
        }
        System.out.format("Positive: %s", count);
        System.out.println();
    }

    private static void showMax(int[] arr) {
        int max = Arrays.stream(arr).summaryStatistics().getMax();
        System.out.format("Max: %s", max);
        System.out.println();
    }

    private static void showMin(int[] arr) {
        int min = Arrays.stream(arr).summaryStatistics().getMin();
        System.out.format("Min: %s", min);
        System.out.println();
    }

    private static void showArr(int[] arr) {

        System.out.println("Array:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    private static void fillArr(int[] arr) {
        int MAX_VALUE = 20;
        int MIN_VALUE = 10;
        Random r = new Random();

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = r.nextInt(MAX_VALUE) - MIN_VALUE;
        }
    }
}
