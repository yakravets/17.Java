import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task12 {

    enum OrderBy{
        Asc, Desc
    }

    public static void main(String [] args) {

        int[] arr = new int[10];
        fillArr(arr);
        showArr(arr);

        sortArray(arr, OrderBy.Asc);
        showArr(arr);
        sortArray(arr, OrderBy.Desc);
        showArr(arr);
    }

    private static void sortArray(int[] arr, OrderBy direction)
    {

        if(direction == OrderBy.Asc){
            Arrays.sort(arr);
        }
        else if(direction == OrderBy.Desc){
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i]; // swap numbers
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
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
