import java.util.Random;

public class Task10 {
    public static void main(String [] args) {

        int[] arr = new int[10];
        fillArr(arr);

        System.out.println("Array:");
        showArr(arr);

        clonePairNumbers(arr);
        cloneNoPairNumber(arr);

        clonePositively(arr);
    }

    private static void clonePositively(int[] arr) {
        int countPositive = 0;
        int countNegative = 0;

        for (int i=0;i<arr.length;i++){
            if(arr[i] >=0)
            {
                countPositive++;
            }
            else {
                countNegative++;
            }
        }

        int[] positive = new int[countPositive];
        int[] negative = new int[countNegative];

        int posPos = 0;
        int posNeg = 0;

        for (int i=0;i<arr.length;i++){
            if(arr[i] >=0)
            {
                positive[posPos] = arr[i];
                posPos++;
            }
            else {
                negative[posNeg] = arr[i];
                posNeg++;
            }
        }

        System.out.println("Positive:");
        showArr(positive);
        System.out.println("Negative:");
        showArr(negative);
    }

    private static void cloneNoPairNumber(int[] arr) {
        int count = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] %2 != 0)
            {
                count+=1;
            }
        }

        int pos = 0;
        int[] notpairs = new int[count];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] %2 != 0)
            {
                notpairs[pos] = arr[i];
                pos+=1;
            }
        }

        System.out.println("Not pairs:");
        showArr(notpairs);
    }

    private static void clonePairNumbers(int[] arr) {
        int count = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] %2 == 0)
            {
                count+=1;
            }
        }

        int pos = 0;
        int[] pairs = new int[count];
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i] %2 == 0)
            {
                pairs[pos] = arr[i];
                pos+=1;
            }
        }

        System.out.println("Pairs:");
        showArr(pairs);
    }

    private static void showArr(int[] arr) {

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
