import java.util.Scanner;

public class Task8 {
    public static void main(String [] args) {

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner((System.in));

        int k = sc.nextInt();
        int l = sc.nextInt();

        for(int i=k; i<=l;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.format("%s*%s=%s", i, j, i*j);
                System.out.println();
            }
            System.out.println();
        }

    }
}
