import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        ArrayT6 arr = new ArrayT6(10);
        arr.Show();

        System.out.println("Min: " + arr.Min());
        System.out.println("Max: " + arr.Max());
        System.out.println("Avg: " + arr.Avg());
    }
}

interface IMath
{
    int Max();
    int Min();
    float Avg();
    void Show();
}

class ArrayT6 implements IMath
{
    static int MIN_VALUE = -10;
    static int MAX_VALUE = 50;

    private final int[] arr;

    public ArrayT6(int length) {
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
    public int Max() {
        return Arrays.stream(arr).summaryStatistics().getMax();
    }

    @Override
    public int Min() {
        return Arrays.stream(arr).summaryStatistics().getMin();
    }

    @Override
    public float Avg() {
        return (float)Arrays.stream(arr).summaryStatistics().getAverage();
    }

    @Override
    public void Show() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}