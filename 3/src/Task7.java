import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        ISort arr = new Array(10);
        arr.show();

        arr.SortAsc();
        arr.show();

        arr.SortDesc();
        arr.show();
    }
}

interface ISort
{
    void SortAsc();
    void SortDesc();
    void show();
}

class Array implements ISort
{
    static int MIN_VALUE = -10;
    static int MAX_VALUE = 50;

    private final int[] arr;

    public Array(int length) {
        arr = new int[length];

        InitRandom();
    }

    private void InitRandom()
    {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt((MAX_VALUE - MIN_VALUE) + 1)+MIN_VALUE;
        }
    }

    @Override
    public void SortAsc() {
        Arrays.sort(arr);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(arr);

        // Reverse arr.
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    @Override
    public void show() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}